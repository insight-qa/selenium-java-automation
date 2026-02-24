package Selenium04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'fi')]")).sendKeys("Rogersoft");
		driver.findElement(By.xpath("//input[starts-with(@name,'la')]")).sendKeys("institute");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("7736251005");
		driver.findElement(By.xpath("//input[contains(@id,'Name')]")).sendKeys("rogersoft@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'addre')]")).sendKeys("thrikakkara p.o");
		driver.findElement(By.xpath("//input[starts-with(@name,'city')]")).sendKeys("kakkanad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("683035");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("valid");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("valid");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("valid");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		

	}

}
