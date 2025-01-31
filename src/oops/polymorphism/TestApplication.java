package oops.polymorphism;

public class TestApplication {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.maximise();
		driver.chromeMenu();
		driver.navigate("https://www.google.com/");
		driver.sendKeys("selenium by h2k");
		driver.click();
		driver.close();
		
		System.out.println("*********************************");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.maximise();
		driver1.navigate("https://www.amazon.com/");
		driver1.sendKeys("iphone 17");
		driver1.click();
		

	}

}
