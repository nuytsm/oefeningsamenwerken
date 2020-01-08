package scanner;

public class replace {
	
		public static void main(String[]args) {
		String s = "leeftijd is : 54";
		s = s.replaceAll("\\D+", "");
		
		int x = Integer.parseInt(s);
		
		System.out.println(x + 2);
}	
}
