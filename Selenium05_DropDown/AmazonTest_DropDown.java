package Selenium05_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTest_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
		Select obj = new Select(dropdown);
		//obj.selectByIndex(3);
		//obj.selectByValue("search-alias=amazon-devices");
		obj.selectByVisibleText("Amazon Fresh");
		
	}

}
