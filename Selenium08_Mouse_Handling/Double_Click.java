package Selenium08_Mouse_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		

	}

}
