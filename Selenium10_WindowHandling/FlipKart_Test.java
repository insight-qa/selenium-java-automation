package Selenium10_WindowHandling;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium11_Screenshot.Screenshot_utility;

public class FlipKart_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Screenshot_utility.captureScreenshot(driver,"flipkart");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		 
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Television");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[5]")).click();
		
		ArrayList<String>handles=new ArrayList<String>(driver.getWindowHandles());
		String child1=handles.get(1);
		System.out.println(child1);
		String child2=handles.get(2);
		System.out.println(child2);
		
		driver.switchTo().window(child1);
		Screenshot_utility.captureScreenshot(driver,"child1");
		WebElement tv1=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		tv1.click();
		
		driver.switchTo().window(child2);
		Screenshot_utility.captureScreenshot(driver,"child2");
		WebElement tv2=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		tv2.click();
		
	}

}
