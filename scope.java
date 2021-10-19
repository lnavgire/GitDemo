import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubof links on the page
		//a
		
		// give me  the count

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column chechk if pages are opening
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
		
			String clickonlinktab =Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}//open all all tabs
		
		

		Set<String> abc=driver.getWindowHandles();
		
		Iterator<String>it=abc.iterator();

	
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());
		}
		
		
		
	}

}
