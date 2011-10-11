package com.pace.base.utility;

import java.util.UUID;

public class GUIDUtil {
	public static String getGUID() {
		UUID guid = UUID.randomUUID();
		return guid.toString();
	}
}
