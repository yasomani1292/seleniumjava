package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.quackit.com/html/templates/frames/frames_example_1.html");
		
		driver.switchTo().frame("content");
		driver.findElement(By.linkText("Code Generator")).click();

		String id1 = driver.getWindowHandles().toArray()[0].toString();
		String id2 = driver.getWindowHandles().toArray()[1].toString();
		System.out.println(id1);
		System.out.println(id2);

		driver.switchTo().window(id2);
		driver.findElement(By.name("search")).sendKeys("This is new window");

		// int numWind = driver.getWindowHandles().size();
		// String lastID = driver.getWindowHandles().toArray()[numWind -
		// 1].toString();
		// driver.switchTo().window(lastID);
		// driver.close();

	}

}
