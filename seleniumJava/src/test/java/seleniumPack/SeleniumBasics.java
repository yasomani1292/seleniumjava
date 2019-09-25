package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");

		// locators 8
		// id, name, linktext, partialLinkText, tagname, classname, xpath, cssSelector

		WebElement chk1 = driver.findElement(By.name("email_to[]"));
		chk1.click();
		System.out.println(chk1.isSelected());

		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='1']")).click();
	
		//Select 3rd checkbox
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='2']")).click();
		
		driver.findElement(By.id("subject")).sendKeys("Selenium");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");    
	    driver.findElement(By.id("q1")).sendKeys("java"); 
	    
	    
	    
	    Select dd1 = new Select(driver.findElement(By.id("q3")));
	    dd1.selectByIndex(1);
	    dd1.selectByVisibleText("Third Option");
	    dd1.selectByValue("Fourth Option");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
