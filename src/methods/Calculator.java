package methods;

public class Calculator {

	public static void calSub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Sub of given numbers : " + sub);
	}

	public static void calSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of given numbers : " + sum);
	}
	
	public static void calSum(int num1, int num2, int num3) {
		int sum = num1 + num2;
		System.out.println("Sum of given numbers : " + sum);
	}
	
	
	
	public static void calMul(int num1, int num2) {
		int res = num1 * num2;
		System.out.println("Multiplation of given numbers : " + res);	
	}
	
	public static void calDiv(int num1, int num2) {
		int res = num1 / num2;
		System.out.println("Division of given numbers : " + res);	
	}
	
	
	public static void main(String[] args) 
	{
		Calculator.calSum(100, 200);
		Calculator.calSum(10, 10, 10);
		Calculator.calSub(50, 25);
		Calculator.calMul(10, 30);
		Calculator.calDiv(100, 2);
	}

}
