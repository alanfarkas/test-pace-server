package com.palladium.paf;

public class PafSoapException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5922560095240193189L;
	
	private String[] messageDetail;
		
	public PafSoapException() {}
	   
	public PafSoapException(PafException exception) {
		super( exception );

		// if cause is null then just get message details
		if (exception.getCause() == null) {
			if (exception.getMessageDetails() != null) 
					messageDetail = exception.getMessageDetails().toArray(new String[0]);
				else
					messageDetail = new String[] {"No message detail available"};
		}
		else {
			if (exception.getCause().getMessage() != null) {	
				
				messageDetail =  new String[] { exception.getCause().getMessage() };
			}
			else
				messageDetail = new String[] {"No message detail available"};			
		}	
	}

				

	
	public String getMessage() {
		return super.getMessage();
	}
	
	public void setMessage(String message) {
	}

    /**
     * @return Returns the messageDetail.
     */
    public String[] getMessageDetail() {
        return messageDetail;
    }

    /**
     * @param messageDetail The messageDetail to set.
     */
    public void setMessageDetail(String[] messageDetail) {
        this.messageDetail = messageDetail;
    }

}
