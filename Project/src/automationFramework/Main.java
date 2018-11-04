package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModules.SignIn_Action;
import pageObjects.BusinessPageTest;
import pageObjects.ClientPageTest;
import Utility.Constant;
import Utility.ExcelUtils;

public class Main {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "LogIn");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelen\\Desktop\\Sve za projekat\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		SignIn_Action.Execute(driver);

		System.out.println("Login Successfully.");

		// Test for Business Page
		driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']")).click();
		Thread.sleep(2000);
		BusinessPageTest.AddNewBusinessTest(driver);
		Thread.sleep(2000);
		BusinessPageTest.AddNewBankAccountTest(driver);
		Thread.sleep(2000);

		// Test for Clients Page
		driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")).click();
		Thread.sleep(2000);
		ClientPageTest.SetUpExcel();
		ClientPageTest.AddNewClientTest(driver);
		Thread.sleep(2000);

		driver.quit();

	}

}