package examendecember;
import java.util.Scanner;
public class Oefening3 {
	Scanner s = new Scanner(System.in);
	 public static void main(String[] args) {
		 Oefening3 oef= new Oefening3();
		 oef.oef3();
		 
}
	 public void oef3() {
		 String zin="Ik ben Mitch.Ik ben 15 jaar.Ik woon in Neerpelt";
	        String[] a = zin.split("[.,?,!]",0); 
	        for (String b : a) 
	            resultaadoef3(b); 
	    } 
	 public void resultaadoef3(String b) {
		 System.out.println(b);
		 
	 }
} 
		 
		 

