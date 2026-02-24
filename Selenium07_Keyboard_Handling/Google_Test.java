package Selenium07_Keyboard_Handling;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.id("APjFqb"));
		search.sendKeys(Keys.SHIFT,"mumbai");
		search.sendKeys(Keys.ENTER);


	}

}
