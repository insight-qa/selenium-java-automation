package Selenium03_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1758686390452&no_sw_cr=1");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Books");
		Thread.sleep(500);//wait
		driver.findElement(By.className("gNO89b")).click();

	}

}
