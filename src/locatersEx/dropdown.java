package locatersEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/store/default.php");
		WebElement we=driver.findElement(By.name("category_id"));
		Select sel=new Select(we);
		//sel.selectByVisibleText("Databases");
         sel.selectByIndex(3);
	}

}
