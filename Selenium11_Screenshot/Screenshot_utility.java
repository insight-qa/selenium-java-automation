package Selenium11_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_utility
{
	public static void captureScreenshot (WebDriver driver,String title) throws IOException
	{
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(image, new File("./shorts/"+title+".png"));
	}
	

}
