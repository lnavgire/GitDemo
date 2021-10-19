import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4feature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']")).getText());
			
			System.out.println(driver.findElement(By.xpath("//label[text()='Entrepreneur (disabled)']")).getText());

	}
	}


