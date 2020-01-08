import java.util.Scanner;

public class Foutoef {


	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
			Foutoef age = new Foutoef();
			age.moto();

		}

	public void moto() {
		System.out.println("Wat is je leeftijd?");
		String input = s.next();
		int leeftijd = Integer.parseInt(input);
		// swiitch(leeftijd);
		ifelse(leeftijd);
	}

//		public void swiitch(int leeftijd) {
//			switch (leeftijd) {
//			case 16:
//			case 17:
//				System.out.println("Je mag een AM rijbewijs halen.");
//				break;
//			case 18:
//			case 19:
//				System.out.println("Je mag een A1 rijbewijs halen.");
//				break;
//			case 20:
//			case 21:
//				System.out.println("Je mag een A2 rijbewijs halen.");
//				break;
//			case 22:
//				System.out.println("Je mag een A rijbewijs halen.");
//				break;
//			default:
//				System.out.println(
//						"Als je jonger bent als 16 kan je geen rijbewijs halen. Ouder dan 22 mag je elk rijbewijs halen.");
	//
//			}
	// }

	public void ifelse(int leeftijd) {
		if (leeftijd < 16) {
			System.out.println("Je mag nog geen rijbewijs halen.");
			return;
		}
		if (leeftijd >= 16) {
			System.out.println("Je mag een AM rijbewijs halen.");

		}
		if (leeftijd >= 18) {
			System.out.println("Je mag een A1 rijbewijs halen.");

		}
		if (leeftijd >= 20) {
			System.out.println("Je mag een A2 rijbewijs halen.");

		}
		if (leeftijd >= 22) {
			System.out.println("Je mag een A rijbewijs halen.");
			return;
		} else {
			System.out.println("Voer een waarde in.");
		}
	}
}

}
