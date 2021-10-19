import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[ parentid ,childid,subchildid]
		
		Iterator<String>it=windows.iterator();
		driver.switchTo().window(arg0)
		
	

}
