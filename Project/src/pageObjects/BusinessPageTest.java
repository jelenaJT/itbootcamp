package pageObjects;

import org.openqa.selenium.WebDriver;

import Utility.Constant;
import Utility.ExcelUtils;

public class BusinessPageTest {
	
	public static String AddNewBusinessTest(WebDriver driver) throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddNewBusiness");
		
		String businessName = ExcelUtils.getCellData(1, 0);
		System.out.println(businessName);
		String countries = ExcelUtils.getCellData(1, 1);
		System.out.println(countries);
		String city = ExcelUtils.getCellData(1, 2);
		System.out.println(city);
		String street = ExcelUtils.getCellData(1, 3);
		System.out.println(street);
		String zip = ExcelUtils.getCellData(1, 4);
		System.out.println(zip);
		String regNum = ExcelUtils.getCellData(1, 5);
		System.out.println(regNum);
		
		BusinessPage.clickAddNewBusiness(driver).click();
		Thread.sleep(1000);
		BusinessPage.SetBusinessName(driver, businessName);
		Thread.sleep(1000);
		BusinessPage.SetCountries(driver, countries);
		Thread.sleep(1000);
		BusinessPage.SetCity(driver, city);
		Thread.sleep(1000);
		BusinessPage.SetStreet(driver, street);
		Thread.sleep(1000);
		BusinessPage.SetZip(driver, zip);
		Thread.sleep(1000);
		BusinessPage.SetRegistryNumber(driver, regNum);
		Thread.sleep(1000);
		
		return "Pass";
	}
	
	public static String AddNewBankAccountTest(WebDriver driver) throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData+ Constant.File_TestData, "AddBankAccount");
		
		String bankName = ExcelUtils.getCellData(1, 0);
		System.out.println(bankName);
		String accountNumber = ExcelUtils.getCellData(1, 1);
		System.out.println(accountNumber);
		String swiftNumber = ExcelUtils.getCellData(1, 2);
		System.out.println(swiftNumber);
		String paymentInstruction = ExcelUtils.getCellData(1, 3);
		System.out.println(paymentInstruction);
		String currency = ExcelUtils.getCellData(1, 4);
		System.out.println(currency);
			
		BusinessPage.SetAddBankAccount(driver);
		Thread.sleep(1000);
		BusinessPage.SetBankName(driver, bankName);
		Thread.sleep(1000);
		BusinessPage.SetAccountNumber(driver, accountNumber);
		Thread.sleep(1000);
		BusinessPage.SetSwiftNumber(driver, swiftNumber);
		Thread.sleep(1000);;
		BusinessPage.SetPaymentInstructions(driver, paymentInstruction);
		Thread.sleep(1000);
		BusinessPage.addCurrency(driver, currency);
		Thread.sleep(1000);
		BusinessPage.SetBtnAddBankAccount(driver);
		Thread.sleep(1000);
		
		BusinessPage.SetBtnSave(driver);
		Thread.sleep(1000);
		return "Pass";
	}

}
