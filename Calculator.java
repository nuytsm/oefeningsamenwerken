
public class Calcultor {

	
	public static void main(String[] args) {

		Calculator calc = new calculator();

		int resultaat = calc.add(4, 8);
	
	System.out.println(calc.divide(5, 0));
	}

	
	public int add(int a, int b) {
	
	return a + b;
	}
	

	public int divideintegers(int a, int b) {

		return a/b;
	}
	

	public double divide(int a, int b) {
	
	return a/b;
	}

}





