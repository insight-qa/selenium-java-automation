package Selenium05_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTest_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		WebElement dropdown = driver.findElement(By.name("passCount"));
		Select obj = new Select(dropdown);
		obj.selectByIndex(2);
		
		WebElement dropdown2=driver.findElement(By.name("fromPort"));
		Select obj2=new Select(dropdown2);
		obj2.selectByVisibleText("Paris");
		
		WebElement dropdown3 =driver.findElement(By.name("fromMonth"));
		Select obj3=new Select(dropdown3);
		obj3.selectByIndex(6);
		
		WebElement dropdown4=driver.findElement(By.name("fromDay"));
		Select obj4=new Select(dropdown4);
		obj4.selectByValue("5");
		
		WebElement dropdown5=driver.findElement(By.name("toPort"));
		Select obj5=new Select(dropdown5);
		obj5.selectByVisibleText("New York");
		
		WebElement dropdown6=driver.findElement(By.name("toMonth"));
		Select obj6=new Select(dropdown6);
		obj6.selectByValue("2");
		
		WebElement dropdown7=driver.findElement(By.name("toDay"));
		Select obj7=new Select(dropdown7);
		obj7.selectByValue("5");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		
		WebElement dropdown8=driver.findElement(By.name("airline"));
		Select obj8= new Select(dropdown8);
		obj8.selectByIndex(1);
		
		driver.findElement(By.name("findFlights")).click();
		
		
		
		

	}

}
