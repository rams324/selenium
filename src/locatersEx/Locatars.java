package locatersEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locatars {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@id='txtUsername' or @name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input.txtUsername")).sendKeys("Admin");//tag &class
		//driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");//tag&id
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Admin");//tag&attribute for html some many there so it not perfect one
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
      //driver.findElement(By.xpath("//*[contains(@name,'Submit')]")).click();//methods in xpath expression used in dynamic change in values of attributes
       //driver.findElement(By.name("Submit")).click();
       //driver.findElement(By.className("button")).click();
       //driver.findElement(By.linkText("Dashboard"));      //driver.findElement(By.id("welcome")).click();
       //driver.findElement(By.xpath("//*[@id='aboutDisplayLink' and @Name='About']"));
        // driver.findElements(By.cssSelector("#btnLogin")).;
        driver.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();//label means tag name syntax xpath=//label[starts-with(@id,'value')]
	}

}
