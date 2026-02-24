package Selenium06_Alert_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("vandhana");
	System.out.println(al.getText());
	al.accept();
	driver.close();
	
	
}
}
