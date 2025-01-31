package methods;

public class CalculatorNs {

	public void calSub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Sub of given numbers : " + sub);
	}
	
	public void calSum(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of given numbers : " + sum);
	}

	public void calSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of given numbers : " + sum);
	}
	
	public void calMul(int num1, int num2) {
		int res = num1 * num2;
		System.out.println("Multiplation of given numbers : " + res);	
	}
	
	public void calDiv(int num1, int num2) {
		int res = num1 / num2;
		System.out.println("Division of given numbers : " + res);	
	}
	
	// *************************************************************************************************** //
	
	public static void main(String[] args) {
		
		CalculatorNs calci = new CalculatorNs();
		calci.calSum(100, 200);
		calci.calSub(50, 25);
		calci.calMul(10, 30);
		calci.calDiv(100, 2);
		calci.calSum(10, 10, 10);
		
		CalculatorNs calci1 = new CalculatorNs();
		calci1.calSum(100, 200);
		calci1.calSub(50, 25);
		calci1.calMul(10, 30);
		calci1.calDiv(100, 2);
	
		
	}

}














