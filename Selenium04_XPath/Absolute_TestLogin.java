package Selenium04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[1]/input")).sendKeys("student");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[2]/input")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
	}

}
