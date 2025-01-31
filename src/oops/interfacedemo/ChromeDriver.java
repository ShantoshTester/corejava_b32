package oops.interfacedemo;

public class ChromeDriver implements WebDriver {

	public void chromeMenu() {
		System.out.println("chrome browser menu style");
	}
	
	public void maximise() {
		System.out.println("browser maximised");
	}

	public void navigate(String url) {
		System.out.println("navigated to the application "+url);
	}

	public void sendKeys(String text) {
		System.out.println("entered the text : "+text);
	}

	public void click() {
		System.out.println("clicked on an element");	
	}

	public void close() {
		System.out.println("closed the browser");
		
	}

}
