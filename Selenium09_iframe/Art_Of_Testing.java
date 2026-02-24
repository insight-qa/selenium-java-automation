package Selenium09_iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Art_Of_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		//link
		WebElement link=driver.findElement(By.xpath("//a[text()='This is a link']"));
		link.click();
		//textBox
		WebElement textbox=driver.findElement(By.xpath("//input[@id='fname']"));
		textbox.sendKeys("hi,Good Morning");
		//button
		WebElement button=driver.findElement(By.xpath("//button[@id='idOfButton']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).perform();
		button.click();
		//double click
		WebElement doub=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		Actions act2 =new Actions(driver);
		act2.doubleClick(doub).perform();
		//alert-1
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//radio button
		WebElement radio=driver.findElement(By.xpath("//input[@id='female']"));
		radio.click();
		//check box
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox2.click();
		//drop down
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select obj = new Select(dropdown);
		obj.selectByIndex(3);
		//generate alert box-2
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Alert al2=driver.switchTo().alert();
		System.out.println(al2.getText());
		al2.accept();
		//alert box-3
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Alert al3=driver.switchTo().alert();
		System.out.println(al3.getText());
		al3.dismiss();
		//drag and drop
		WebElement drag=driver.findElement(By.xpath("//img[@id='myImage']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(drag, drop).perform();
		
		
	}

}
