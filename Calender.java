import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		driver.manage().window().maximize();
		
	List<WebElement> dates = driver.findElements(By.cssSelector(".disabled.day"));
		int count=driver.findElements(By.cssSelector(".disabled.day")).size();
		for(int i=0;i>=count;i++)
		{
			String text=driver.findElements(By.cssSelector(".disabled.day")).get(i).getText();
			
			if(text.equalsIgnoreCase("15"))
			{
				driver.findElements(By.cssSelector(".disabled.day")).get(i).click();
				break;
			}
		}
	}
}

