package locatersEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethod {
	WebDriver driver;
	public void LaunchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void enterById(String loc,String val)
	{
		driver.findElement(By.id(loc)).sendKeys(val);
		
	}
	public void clickByXpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
public void clickByLinktext(String link)
{
	driver.findElement(By.linkText(link)).click();
}
public void screenShot(String path1) throws IOException
{
	 TakesScreenshot logo= ((TakesScreenshot)driver);
     File file=logo.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file,new File(path1));
     

}
public void closeApp()
{
	driver.close();
}
}
