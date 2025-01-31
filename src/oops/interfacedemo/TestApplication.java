package oops.interfacedemo;

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
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.maximise();
		driver1.firefoxMenu();
		driver1.navigate("https://www.faceboox.com/");
		driver1.sendKeys("shantosh25@test.com");
		driver1.click();
		driver1.close();

	}

}
