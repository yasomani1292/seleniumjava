package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.91mobiles.com/recharge-plans/vodafone-prepaid");

		// Get number of plans - 3
		System.out.println(driver.findElements(By.xpath("//table[@class='specsTable']//tbody/tr")).size());

		// get number of details for each plan - 3
		System.out.println(driver.findElements(By.xpath("//table[@class='specsTable']//tbody/tr[1]/td")).size());

		// get validity detail of the plan (25 MB 3G Data Pack) - 1 day
		System.out.println(driver
				.findElement(By
						.xpath("//table[@class='specsTable']//td[text()='25 MB 3G Data Pack ']/following-sibling::td[1]"))
				.getText());

		// get price detail of the plan (25 MB 3G Data Pack) - 5
		System.out.println(driver
				.findElement(By
						.xpath("//table[@class='specsTable']//td[text()='25 MB 3G Data Pack ']/following-sibling::td[2]"))
				.getText());

	}

}
