package Selenium04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_MercuryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input [@ name='userName']")).sendKeys("valid");
		driver.findElement(By.xpath("//input [@ name='password']")).sendKeys("valid");
		driver.findElement(By.xpath("//input [@ name='submit']")).click();

	}

}
