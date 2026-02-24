package Selenium09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement iframe=driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(iframe);
		WebElement textbox =driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("hi,Good Morning");
	}

}
