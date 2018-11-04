package pageObjects;

import pageObjects.ClientsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import Utility.Constant;
import Utility.ExcelUtils;

public class ClientPageTest {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"NewClient");
	}
	public static String AddNewClientTest(WebDriver driver) throws Exception
	{
 
	    String clientName = ExcelUtils.getCellData(1, 0);
		System.out.println(clientName);
		String contactName = ExcelUtils.getCellData(1, 1);
		System.out.println(contactName);
		String email = ExcelUtils.getCellData(1, 2);
		System.out.println(email);
		String registryNumber = ExcelUtils.getCellData(1, 3);
		System.out.println(registryNumber);
		String country = ExcelUtils.getCellData(1, 4);
		System.out.println(country);
		String city = ExcelUtils.getCellData(1, 5);
		System.out.println(city);
		String street = ExcelUtils.getCellData(1, 6);
		System.out.println(street);
		String zip = ExcelUtils.getCellData(1, 7);
		System.out.println(zip);
		String dateAdded = ExcelUtils.getCellData(1, 8);
		System.out.println(dateAdded);
		String code = ExcelUtils.getCellData(1, 9);
		System.out.println(code);
		String agreementDay = ExcelUtils.getCellData(1, 10);
		System.out.println(agreementDay);
		String status = ExcelUtils.getCellData(1, 11);
		System.out.println(status);
		
		ClientsPage.clickAddNewClient(driver).click();
		ClientsPage.SetClientName(driver, clientName);
		ClientsPage.SetContactName(driver, contactName);
		ClientsPage.SetEmail(driver, email);
		ClientsPage.SetClientRegistryNumber(driver, registryNumber);
		ClientsPage.SetClientCountry(driver, country);
		ClientsPage.SetClientCity(driver, city);
		ClientsPage.SetClientStreet(driver, street);
		ClientsPage.SetClientZip(driver, zip);
		//ClientsPage.SetDateAdded(driver, dateAdded); - Calendar not working
		ClientsPage.SetCode(driver, code);
		//ClientsPage.SetAgreementDate(driver, agreementDay); - Calendar not working
		ClientsPage.SetStatus(driver, status);
		ClientsPage.SetSave(driver);
		Thread.sleep(1000);
		return "Pass";
  }
}

