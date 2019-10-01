package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastValFromDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");

		// Select last value from all dropdown
		List<WebElement> allDD = driver.findElements(By.tagName("select"));
		int numDD = allDD.size();
		for (int i = 0; i < numDD; i++) {
			Select dd = new Select(allDD.get(i));
			int numOpts = dd.getOptions().size();
			dd.selectByIndex(numOpts - 1);
		}

	}

}
