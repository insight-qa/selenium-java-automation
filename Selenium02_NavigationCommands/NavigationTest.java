package Selenium02_NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		driver.navigate().back();// navigate to back
		driver.navigate().forward(); // navigate to front
		driver.navigate().to("https://www.google.com/?zx=1758601510973&no_sw_cr=1");//navigate to another url
		driver.navigate().refresh();//to refresh
		
	}

}
