package locatersEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.name("pollanswers-1")).click();/for sigle elemet 
		/*WebElement rb=driver.findElement(By.name("pollanswers-1"));
		rb.click();*///for single web element
		//for group of object or web elements we need to use collections like arraylist
		//create Arraylist for same web elements all are  having same attribute and value
		List<WebElement> rb=driver.findElements(By.name("pollanswers-1"));
		((WebElement) rb.get(0)).click();
		//driver.quit();
		
		
	}

}
