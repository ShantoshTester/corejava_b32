package oops.inheritance;

public class Iphone6 extends Iphone4 {
	
	// if a child class has the same method like its parent class then this method is called as Method Overriding
	public void camera()
	{
		System.out.println("Enhanced 2mp Camera");
	}
	
	public void siri()
	{
		System.out.println("Introduced a feature called as Siri for voice assistant");
	}

}
