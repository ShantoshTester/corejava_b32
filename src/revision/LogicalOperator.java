package revision;

public class LogicalOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// & AND = only if both the condition are true only then the result is true
		System.out.println("************ && Operator ****************");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// | OR = the result will be true if any of the values are true
		System.out.println("************ || Operator ****************");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		// ^ EX-OR = when both are same then the result is false
		System.out.println("************ ^ Operator ****************");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

	}

}
