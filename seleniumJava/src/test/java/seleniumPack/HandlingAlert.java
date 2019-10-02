package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);

		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

		// try {
		// driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//
		// String txt = driver.switchTo().alert().getText();
		// System.out.println(txt);
		//
		// driver.switchTo().alert().accept();
		// // driver.switchTo().alert().dismiss();
		// } catch (NoAlertPresentException e) {
		// System.out.println("NoAlertPresentException Occured");
		// }
		// System.out.println("last line");

	}

}
