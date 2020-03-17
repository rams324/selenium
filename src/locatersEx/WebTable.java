package locatersEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		int r,c;
		String xp;
		//*[@id="customers"]
		//*[@id="customers"]/tbody/tr[1]/th[1]
		for(r=2;r<=7;r++)
		{
			for(c=1;c<=3;c++)
			{
				xp = "	//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]";
				
				String s=driver.findElement(By.xpath(xp)).getText();
				System.out.print(s +"");
			}
			System.out.println();
		}

	}

}
