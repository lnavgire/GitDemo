import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/ref=nav_logo");
        
        
        driver.get("Linux is here");
        
        driver.get("RootCodefire is here");
        
        
        driver.manage().window().maximize();
        
        Actions a= new Actions(driver);
        
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        
        a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        
        //moves to specific element
        a.moveToElement(move).contextClick().build().perform();
	}

}