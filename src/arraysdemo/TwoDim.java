package arraysdemo;

public class TwoDim {

	public static void main(String[] args) {

		String s[][] = new String[3][4];

		s[0][0] = "A0";
		s[0][1] = "B0";
		s[0][2] = "C0";
		s[0][3] = "D0";

		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		s[1][3] = "D1";

		s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";
		s[2][3] = "D2";

		// length returns the size of the array.
		int rowsize = s.length;
		System.out.println("size of the row " + rowsize);
		int colsize = s[0].length;
		System.out.println("size of the col " + colsize);

		// accessing the elements by passing the index
		System.out.println(s[2][3]);
		System.out.println(s[1][2]);
		System.out.println(s[0][0]);
//		System.out.println(s[0][4]); -- this will throw ArrayIndexOutOfBound Exception
		
		System.out.println("********** printing all the values using nested for loop ***********");

		for (int i = 0; i < rowsize; i++) 
		{
			for(int j=0; j< colsize; j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
