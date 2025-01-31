package constructorsdemo;

public class SamsungMobile {
	
	String modelName;
	int serialNo;
	String color;
	
	public SamsungMobile(String mName,int serial,String color)
	{
		this.modelName = mName;
		this.serialNo = serial;
		this.color = color;
		System.out.println(modelName+" : "+serialNo+" : "+color);
	}
	
	public SamsungMobile(String mName,int serial)
	{
		this.modelName = mName;
		this.serialNo = serial;
		System.out.println(modelName+" : "+serialNo+" : "+color);
	}
	
	public static void main(String[] args) 
	{
		SamsungMobile m1 = new SamsungMobile("A55", 56989, "pearl-white");
		SamsungMobile m2 = new SamsungMobile("A55", 89788, "dark-blue");
		SamsungMobile m3 = new SamsungMobile("S24", 123456);
	}

}
