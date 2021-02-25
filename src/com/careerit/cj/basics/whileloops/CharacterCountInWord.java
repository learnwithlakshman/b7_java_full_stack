package com.careerit.cj.basics.whileloops;

public class CharacterCountInWord {

	public static void main(String[] args) {
		String name = "learning core java is fun";
		// vowel, consonants-special characters count ( a ,e , i , o, u)

		int vcount = 0;
		int cscount = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

//			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
//				vcount++;
//			} else {
//				cscount++;
//			}

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vcount++;
				break;

			default:
				cscount++;
			}

		}
		System.out.println("Vowel count :" + vcount);
		System.out.println("Consonants and special characters count :" + cscount);
	}
}
