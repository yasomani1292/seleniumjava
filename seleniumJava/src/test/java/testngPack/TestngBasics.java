package testngPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngBasics {

	// priority order -1 0 +1

	@Test(priority = -1)
	public void removeAccount() {
		System.out.println("removeAccount");
	}

	@Test(dataProvider = "dp")
	public void addAccount(String name, String acctNum) {
		System.out.println(name + "\t" + acctNum);
		System.out.println("addAccount");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Navigate to accounts page");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Navigate to home page");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "Mani", "12345" }, new Object[] { "Veena", "23451" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("login to application");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("logout from application");
	}

}
