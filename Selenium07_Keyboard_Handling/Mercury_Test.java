package Selenium07_Keyboard_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
		name.sendKeys(Keys.SHIFT,"vandhana");
		name.sendKeys(Keys.CONTROL,"a","c");
		WebElement name2=driver.findElement(By.xpath("//input[@name='lastName']"));
		name2.sendKeys(Keys.CONTROL,"v");
		//WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		name2.sendKeys(Keys.TAB,"62787647849",Keys.BACK_SPACE);
		name2.sendKeys(Keys.ENTER);

	}

}
