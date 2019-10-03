package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksWithFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.quackit.com/html/templates/frames/frames_example_1.html");

		int numFrames = driver.findElements(By.tagName("frame")).size();

		for (int f = 0; f < numFrames; f++) {
			// Switch to frame
			driver.switchTo().frame(f);

			// Printing all links
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int numLinks = links.size();
			System.out.println(numLinks);

			for (int i = 0; i < numLinks; i++) {
				System.out.println(links.get(i).getText());
			}
			driver.switchTo().defaultContent();
		}

	}

}
