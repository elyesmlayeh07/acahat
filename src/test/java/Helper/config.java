package Helper;

import org.openqa.selenium.WebDriver;

public class config {
	public static WebDriver driver;
	
	public static void confchrome() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
}
	public static void  maximiseWindow() {
		driver.manage().window().maximize();
}
}