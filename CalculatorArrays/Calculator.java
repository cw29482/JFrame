public class Calculator {
	public static double getSum(double one, double two, double three){
		return one+two+three;
	}
	
	public static double getSum(double [] num) {
		double sum = 0.0;
		for (int i = 0; i<num.length; i++){
			sum+=num[i];
		}
		return (sum);
	}
	
	public static double getAverage(double first, double second, double third){
		return ((first+second+third)/3.0);
	}
	
	public static double getAverage(double [] num2) {
		double sum = 0.0;
		for (int i = 0; i<num2.length; i++) {
			sum+=num2[i];
		}
		return (sum/num2.length);
	}
	
	public static int getProduct(int first, int second){
		return first*second;
	}
	
	public static int getProduct(int [] num3) {
		int product = num3[0] * num3[1];
		return product;
	}

}
