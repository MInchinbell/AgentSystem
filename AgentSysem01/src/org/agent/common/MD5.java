package org.agent.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String MD5Encode(String origin) {
		String resultString = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");// 加密算法
			resultString = byteArrayToHexString(md.digest(origin.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultString;
	}

	private static String byteArrayToHexString(byte[] digest) {
		// TODO Auto-generated method stub
		// bute -128-127
		// 128位digest 转换16进制32位字符串
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			result.append(byteToHexString(digest[i]));

		}
		return result.toString();
	}

	public final static String[] bexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f", };

	private static Object byteToHexString(byte b) {
		// TODO Auto-generated method stub
		int n = b;
		if (n < 0)
			n = n + 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return bexDigits[d1] + bexDigits[d2];

	}
}
