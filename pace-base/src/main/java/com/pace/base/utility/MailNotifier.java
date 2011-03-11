package com.pace.base.utility;

// MailNotifier.java by Rowland http://home.comcast.net/~rowland3/
// uses JavaMail to send a message

// NOTE: Needs mail.jar and activation.jar in CLASSPATH to run
//       Needs mail.jar to compile

import java.net.InetAddress;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/** MailNotifier - a utility class to send a SMTP mail notification * */
public class MailNotifier {
	
	private final static Logger logger = Logger.getLogger(MailNotifier.class);
	
	final String localhost;

	final String mailhost;

	final String mailuser;

	final String email_notify;

	protected Session session = null;

	public MailNotifier(String _localhost, String _mailhost, String _mailuser,
			String _email_notify) {
		localhost = _localhost;
		mailhost = _mailhost;
		mailuser = _mailuser;
		email_notify = _email_notify;
	}

	public void send(String subject, String text) throws PafException {
		send(email_notify, subject, text);
	}

	public void send(String _to, String subject, String text)
			throws PafException {

		if (session == null) {

			Properties p = new Properties();
			p.put("mail.host", mailhost);
			p.put("mail.user", mailuser);

			session = Session.getDefaultInstance(p, null);

			// Try to fake out SMTPTransport.java and get working EHLO:
			Properties properties = session.getProperties();
			String key = "mail.smtp.localhost";
			String prop = properties.getProperty(key);
			if (prop == null) {
				properties.put(key, localhost);
			} else {
				logger.info(key + ": " + prop);
			}

		}
		MimeMessage msg = new MimeMessage(session);

		try {
			
			msg.setText(text);
			msg.setSubject(subject);
			Address fromAddr = new InternetAddress(mailuser);
			msg.setFrom(fromAddr);
			Address toAddr = new InternetAddress(_to);
			msg.addRecipient(Message.RecipientType.TO, toAddr);
			Transport.send(msg);

			
		} catch (Exception e) {
			
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("An error occurred when attempting to send an email to address '" + _to + "'.  Please contact an administrator.  The error returned from the server: " + e.getMessage() + ".", PafErrSeverity.Info);
			
		}
		// Note: will use results of getLocalHost() to fill in EHLO domain
	}

	/**
	 * Get the name of the local host, for use in the EHLO and HELO commands.
	 * The property mail.smtp.localhost overrides what InetAddress would tell
	 * us. Adapted from SMTPTransport.java
	 * 
	 * @return String
	 */
	public String getLocalHost() {
		String localHostName = null;
		String name = "smtp"; // Name of this protocol
		try {
			// get our hostname and cache it for future use
			if (localHostName == null || localHostName.length() <= 0)
				localHostName = session.getProperty("mail." + name
						+ ".localhost");
			if (localHostName == null || localHostName.length() <= 0)
				localHostName = InetAddress.getLocalHost().getHostName();
		} catch (Exception uhex) {
		}
		return localHostName;
	}

	/***************************************************************************
	 * main() for testing pursposes
	 * 
	 * @param args
	 * 
	 */
	public static void main(String args[]) {
		// Adapt to your needs:
		// String localhost= "palladiumes.com";
		String mailhost = "thkex01.corp.thinkfast.com";

		String localhost = mailhost;

		String mailuser = "admin@palladiumes.com";
		//String email_notify = "Jason.Milliron@palladiumes.com";

		String email_notify = "jason.milliron@palladiumes.com";
		
		MailNotifier mn = new MailNotifier(localhost, mailhost, mailuser,
				email_notify);
		try {
			mn.send("FYI", "test!");
		} catch (PafException e) {
			
			Throwable exc = e.getCause();
			
			if ( exc instanceof MessagingException) {
				
				if ( exc instanceof SendFailedException) {
					
				//} else if ( exc instanceof ) {
					System.err.println(exc.getMessage());
					
				} else {
					System.err.println(exc.getMessage());
				}
				
				
				
			} else {
			
				System.err.println(e.toString());
			}
		}
	}
}
