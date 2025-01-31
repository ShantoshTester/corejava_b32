package oops.polymorphism;

public class TestApplication2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.maximise();
//		driver.chromeMenu();
		driver.navigate("https://www.google.com/");
		driver.sendKeys("selenium by h2k");
		driver.click();
		driver.close();
		
		System.out.println("*********************************");
		
		driver = new FirefoxDriver();
		driver.maximise();
		driver.navigate("https://www.amazon.com/");
		driver.sendKeys("iphone 17");
		driver.click();
		

	}

}
