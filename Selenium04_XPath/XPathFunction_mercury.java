package Selenium04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFunction_mercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*sign in 
		 * username-contains
		 * password-starts-with
		 * submit-
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("valid");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("valid");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();

	}

}
