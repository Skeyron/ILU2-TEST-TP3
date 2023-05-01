package ilu2;


import java.lang.String;
public class Welcome {
	
	private static String firstMaj(String nom) {
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
	
	private static String[] minTab(String input) {
		String[] listeName = input.split(",");
		int indice = 0;
		for (int i = 0; i < listeName.length; i++) {
			if ( !listeName[i].toUpperCase().equals(listeName[i]) ) {
				indice += 1;
			}
		}
		String[] tab = new String[indice];
		indice = 0;
		for (int i = 0; i < listeName.length; i++) {
			if ( !listeName[i].toUpperCase().equals(listeName[i]) ) {
				tab[indice] = firstMaj(listeName[i].trim());
				indice ++;
			}
		}
		return tab;
	}
	
	private static String[] majTab(String input) {
		String[] listeName = input.split(",");
		int indice = 0;
		for (int i = 0; i < listeName.length; i++) {
			if ( listeName[i].toUpperCase().equals(listeName[i]) ) {
				indice += 1;
			}
		}
		String[] tab = new String[indice];
		indice = 0;
		for (int i = 0; i < listeName.length; i++) {
			if ( listeName[i].toUpperCase().equals(listeName[i]) ) {
				tab[indice] = firstMaj(listeName[i].trim());
				indice ++;
			}
		}
		return tab;
	}
	
	private static String minList( String input ) {
		String[] min = minTab(input);
		StringBuilder minOutput = new StringBuilder();
		if (min.length > 0) {
			for (int i = 0; i < min.length; i++) {
				minOutput.append(min[i]);
				if (i!= min.length -1) {
					minOutput.append(", ");
				}
			}
			return minOutput.toString();
		}
		return null;
	}
	
	private static String majList( String input ) {
		String[] maj = majTab(input);
		StringBuilder majOutput = new StringBuilder();
		if (maj.length > 0) {
			for (int i = 0; i < maj.length; i++) {
				majOutput.append(maj[i]);
				if (i!= maj.length -1) {
					majOutput.append(", ");
				}
			}
			return majOutput.toString();
		}
		return null;
	}
	
	private static String manyNames(String input) {
		StringBuilder majOutput = new StringBuilder();
		StringBuilder minOutput = new StringBuilder();
		StringBuilder reponse = new StringBuilder();
		if (minList(input) == null) {
			reponse.append("HELLO, ");
			reponse.append(majList(input));
			reponse.append(" !");
		} else if ( majList(input) != null) { 
			reponse.append("Hello, ");
			reponse.append(minList(input));
			reponse.append(". AND HELLO, ");
			reponse.append(majList(input));
			reponse.append(" !");
		} else {
			reponse.append("Hello, ");
			reponse.append(minList(input));
		}
		return reponse.toString();
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
		if (input.split(",").length >= 2) {
			return manyNames(input);
		}
		String toCap = firstMaj(input);
		reponse.append(toCap);
		return reponse.toString();
	}
	

	
}
