public class CalculatorDriver {

	public static void main(String[] args) {
		double [] num = new double [3];
		num [0] = 6.0;
		num [1] = 4.0;
		num [2] = 2.0;
		
		double [] num2 = new double [3];
		num2 [0] = 2.0;
		num2 [1] = 2.0;
		num2 [2] = 4.0;
		
		int [] num3 = new int [2];
		num3 [0] = 2;
		num3 [1] = 3;
		
		System.out.println(Calculator.getSum(6.0, 4.0, 2.0));
		System.out.println(Calculator.getSum(num));
		System.out.println(Calculator.getAverage(2, 2, 4));
		System.out.println(Calculator.getAverage(num2));
		System.out.println(Calculator.getProduct(2, 3));
		System.out.println(Calculator.getProduct(num3));
	}

}
