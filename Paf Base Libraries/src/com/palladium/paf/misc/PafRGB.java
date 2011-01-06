package com.palladium.paf.misc;

import org.apache.log4j.Logger;

public class PafRGB {
	
	private static Logger logger = Logger.getLogger(PafRGB.class);

	private int red;

	private int green;

	private int blue;
	
	private PafRGB() {
	}
	
	public PafRGB(String hexValue) {
			
		//make sure hex starts with a #
		if ( hexValue.matches("^#*") ) {
			PafRGB rgb = PafRGB.hexStringToRGB(hexValue);
			this.blue = rgb.blue;
			this.red = rgb.red;
			this.green = rgb.green;
		} 
		
	}

	public PafRGB(int red, int green, int blue) {

		this.red = red;
		this.green = green;
		this.blue = blue;

	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}
	
	public String getHexValue() {
		
		return PafRGB.rgbToHexString(this);
		
	}

	public static String rgbToHexString(PafRGB rgb) {

		logger.debug(rgb);
		
		String red = Integer.toHexString(rgb.red);
		if (red.length() < 2) {
			red = "00".substring(0, 2 - red.length()) + red;
		}

		String green = Integer.toHexString(rgb.green);
		if (green.length() < 2) {
			green = "00".substring(0, 2 - green.length()) + green;
		}
		String blue = Integer.toHexString(rgb.blue);
		if (blue.length() < 2) {
			blue = "00".substring(0, 2 - blue.length()) + blue;
		}

		return "#" + red + green + blue;
	}
	
	public static PafRGB hexStringToRGB(String hex) {
		
		PafRGB rgb = new PafRGB();
		
		rgb.red = Integer.parseInt(hex.substring(1, 3), 16);
		rgb.green = Integer.parseInt(hex.substring(3, 5), 16);
		rgb.blue = Integer.parseInt(hex.substring(5, 7), 16);
		
		logger.debug(rgb);
		
		return rgb;
	}
	
	public String toString() {
		return "PafRGB {" + red + ", " + green + ", " + blue + "}";
	}
}
