package com;

public class PasswordVerify {
	
	
	public static boolean verify(String password) {
		checkNullValue(password);
		// need a check method for empty string 
		checkEmptyValue(password);
		return verifyPasswordHasMore8Character(password)
				&& verifyPasswordHasUpperCaseCharacter(password) 
				&& verifyPasswordHasLowcaseCharacter(password)
				&& verifyPasswordHasNumber(password);
	}

	private static boolean verifyPasswordHasLowcaseCharacter(String password) {
		int lowercaseCount = password.split("(?=[a-z])").length - 1;
		return lowercaseCount > 0;
	}
	
	private static boolean verifyPasswordHasNumber(String password) {
		 int numberCount = password.split("(?=[0-9])").length - 1;
		 return numberCount > 0;
	}

	private static boolean verifyPasswordHasMore8Character(String password) {
		return password.length() > 8;
	}

	private static boolean verifyPasswordHasUpperCaseCharacter(String password) {
		int uppercaseCount = password.split("(?=[A-Z])").length - 1;
		return uppercaseCount > 0;
	}

	private static void checkNullValue(String password) {
		if (password == null)
			throw new IllegalArgumentException();
	}
	
	private static void checkEmptyValue(String password){
		if (password.isEmpty()) 
			throw new IllegalArgumentException();
	}

}
