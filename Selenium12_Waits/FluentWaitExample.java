package Selenium12_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		//Define Fluent Wait
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(30))//max wait time
		.pollingEvery(Duration.ofSeconds(5))//polling interval
		.ignoring(NoSuchElementException.class);//ignore no suchElementException message
		
		WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		System.out.println(msg.getText());
		
				
		
		

	}

}
