package Selenium_BasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1758601510973&no_sw_cr=1");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		driver.close();
	}

}
