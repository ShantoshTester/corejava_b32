package methods;

public class Calci {
	
	public int calSum(int num1, int num2, int num3)
	{
		int res = num1+num2+num3;
		return res;
	}
	
	public static void main(String[] args) {
		
		Calci cal = new Calci();
		int res = cal.calSum(10, 40, 50);
		System.out.println(res);
		System.out.println("Sum of given numbers : "+cal.calSum(10, 40, 100));
	}

}
