package ilu2;


import java.lang.String;
public class Welcome {
	
	private static String maj(String nom) {
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
	
	private static String doubleName(String input) {
		String[] reponse = input.split(",");
		StringBuilder output = new StringBuilder();
		output.append(maj(reponse[0].trim()));
		output.append(", ");
		output.append(maj(reponse[1].trim()));
		return output.toString();
	}
	
	public static String welcome(String input) {
		StringBuilder reponse = new StringBuilder();
		reponse.append("Hello, ");
		if (input == null || input.trim().equals("") )  {
			return "Hello, my friend";
		}
		input = input.trim();
		if (input.toUpperCase().equals(input)) {
			return "HELLO, " + input + " !";
		}
		if (input.split(",").length == 2) {
			return reponse.append(doubleName(input)).toString();
		}
		String toCap = maj(input);
		reponse.append(toCap);
		return reponse.toString();
	}

	
}
