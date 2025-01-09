package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println("& and Operator - both should be true");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println("| or Operator - either one should be true");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("^ ex-or Operator - if both are same then its false");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}

}
