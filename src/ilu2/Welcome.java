package ilu2;


import java.lang.String;
public class Welcome {
	
	private static String maj(String nom) {
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
	
	
	public static String welcome(String input) {
		StringBuilder reponse = new StringBuilder();
		if (input == null || input.trim().equals("") )  {
			return "Hello, my friend";
		}
		input = input.trim();
		if (input.toUpperCase().equals(input)) {
			return "HELLO, " + input + " !";
		}
		String toCap = maj(input);
		reponse.append("Hello, " + toCap);
		return reponse.toString();
	}

}
