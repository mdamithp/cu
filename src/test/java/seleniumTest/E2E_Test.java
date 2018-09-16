package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Test {
	private static WebDriver driver; 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\millaniyage.perera\\Desktop\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
