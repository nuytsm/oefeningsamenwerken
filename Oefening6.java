package Examendecember;

import java.util.Scanner;

public class Oefening6 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Oefening6 oef = new Oefening6();
		oef.bevat();
		oef.omgekeerdafprinten();

	}

	public void omgekeerdafprinten() {
		String a = new String();
		for (int i = 0; i < a.length(); i++) {
			System.out.println("Character place " + (i + 1) + ": " + a.charAt(i));
		}
	}

	public void bevat() {
		System.out.println("Voer een zin in");
		String zin = s.nextLine();
		String woord = s.nextLine();

		if (zin.contains("a")) {
			System.out.println(woord);
		else {
			System.out.println("Geen klinker gevonden");

		}
	}

}