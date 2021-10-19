import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		//driver.get("https://www.google.com/");
		
	
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class='promoCode']")));
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		//explicit wait
		
	
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    
               
	
			}
	
	
	
	//new method
	
	public static void addItems(WebDriver driver , String[] itemsNeeded)
	{
		int j = 0 ;
List <WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<Products.size();i++)
		{
			
			//Brocolli -1kg
			//Brocilli , 1kg
			
			String[] name = Products.get(i).getText().split("-");
			
			String formattedName = name[0].trim();
			
			// formate it nto get actua vegitable name
			
			//covert arrey into arry list for each search
			
			//check whether name you extracted is present in arrry list or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				
				// Click On Add cart
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			    if(j==itemsNeeded.length)
			    {
			    	break;
			    }
			}
		}
	}
	}


