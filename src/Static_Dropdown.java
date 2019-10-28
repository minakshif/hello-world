import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Minakshi\\Desktop\\JBK\\Selenium Software\\geckodriver.exe");
		driver.get("https://www.spicejet.com");
		//for static dropdown for selet currency
		Select s=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s.selectByVisibleText("USD");
		
		// for dynamic dropdown for selelct adult 
		//Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
//		Thread.sleep(2000);
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@value='AIP']"));	
		

	}

}
