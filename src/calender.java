import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Minakshi\\Desktop\\JBK\\Selenium Software\\geckodriver.exe");
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();;
		//Thread.sleep(2000);
		//driver.findElement(By.id("ui-datepicker-div")).click();
		//driver.findElement(By.cssSelector(".ui-state-defaultui-state-highlightui-state-active")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-defaultui-state-highlightui-state-active']")).click();
	}
	

}
