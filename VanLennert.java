package buh;

import Java.util.Scanner;

public class VanLennert{
public int counter = 0;
	
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		VanLennert oef = new VanLennert();
		oef.oefening7();
	}
	
	public void oefening7() {
		System.out.print("Wat is de zin? ");
		String zin = s.nextLine();
		System.out.print("Optie: ");
		int optie = s.nextInt();
		switch (optie) {
			case 1:
				for (int i=0; i < zin.length(); i++) {
					if (zin.toLowerCase().charAt(i) == 'a' || zin.toLowerCase().charAt(i) == 'e' || zin.toLowerCase().charAt(i) == 'i' || zin.toLowerCase().charAt(i) == 'o' || zin.toLowerCase().charAt(i) == 'u') {
						counter = counter + 1;
					} else {
						counter = counter + 0;
					}
				}
				System.out.println("De zin bevat " + counter + " klinkers");
				break;
			case 2:
				for (int i = 0; i < zin.length(); i++) {
					if (zin.toLowerCase().charAt(i) == 'a' || zin.toLowerCase().charAt(i) == 'e' || zin.toLowerCase().charAt(i) == 'i' || zin.toLowerCase().charAt(i) == 'o' || zin.toLowerCase().charAt(i) == 'u' || zin.charAt(i) == ' ') {
						counter = counter + 0;
					} else {
						counter = counter + 1;
					}
				}
				System.out.println("De zin bevat " + counter + " medeklinkers");
				break;
			default:
				for (int i = 0; i < zin.length(); i++) {
					if (zin.charAt(i) == ' ' ) {
						counter = counter + 0;
					}else {
						counter = counter + 1;
					}
				}
				System.out.println("De zin bevat " + counter + " letters");
		}
	}
}
