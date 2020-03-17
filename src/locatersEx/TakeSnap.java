package locatersEx;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='txtUsername' or @name='txtUsername']")).sendKeys("Admin");
       
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();
        TakesScreenshot logo= ((TakesScreenshot)driver);
        File file=logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Screenshot\\.png"));

	}

	

}
