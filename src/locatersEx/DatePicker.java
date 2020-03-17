package locatersEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		Select sel=new Select(month);
		sel.selectByIndex(5);
		WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		Select sel1=new Select(year);
		sel1.selectByIndex(6);
	

	}

}
