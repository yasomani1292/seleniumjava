package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGroupOfElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int numLinks = allLinks.size();
		System.out.println(numLinks);

		for (int i = 0; i < numLinks; i++) {
			String txt = allLinks.get(i).getText();
			System.out.println(txt);
		}
	}

}
