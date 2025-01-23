package arraysdemo;

public class CarsArray {

	public static void main(String[] args) {
		
		String car[] = new String[10];
		car[0] = "BMW";
		car[1] = "Audi";
		car[2] = "Volvo";
		car[3] = "Mecedes";
		car[4] = "Kia-Sonet";
		car[5] = "Honda-Jazz";
		car[6] = "GM";
		car[7] = "Hyndai";
		car[8] = "Ford";
		car[9] = "Tesla";
		
		for (String carBrand : car) 
		{
			System.out.println(carBrand);
		}

	}

}
