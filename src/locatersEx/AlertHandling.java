package locatersEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=358468A60587C7EC17899E8FBAD92950");
        driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();
        Alert a= driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();//this for enter button
        a.dismiss();//cancel button
        a.sendKeys("ramprasad");// prompt button
        a.accept();
}

}
