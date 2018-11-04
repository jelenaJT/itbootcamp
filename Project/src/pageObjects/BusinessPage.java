package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {

	// GET

	public static WebElement clickAddNewBusiness(WebDriver driver) {

		WebElement clickAddNewBusiness = driver
				.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
		return clickAddNewBusiness;

	}

	public static WebElement getBusinessName(WebDriver driver) {

		WebElement getBusinessName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return getBusinessName;
	}

	public static WebElement getCountries(WebDriver driver) {

		WebElement getCountries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return getCountries;
	}

	public static WebElement getCity(WebDriver driver) {

		WebElement getCity = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return getCity;
	}

	public static WebElement getStreet(WebDriver driver) {

		WebElement getStreet = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return getStreet;
	}

	public static WebElement getZip(WebDriver driver) {

		WebElement getZip = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return getZip;
	}

	public static WebElement getRegistryNumber(WebDriver driver) {

		WebElement getRegistryNumber = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return getRegistryNumber;
	}

	public static WebElement getAddBankAccount(WebDriver driver) {

		WebElement getAddBankAccount = driver
				.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return getAddBankAccount;
	}

	public static WebElement getBankName(WebDriver driver) {

		WebElement getBankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return getBankName;
	}

	public static WebElement getAccountNumber(WebDriver driver) {

		WebElement getAccountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return getAccountNumber;
	}

	public static WebElement getSwiftNumber(WebDriver driver) {

		WebElement getSwiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return getSwiftNumber;
	}

	public static WebElement getPaymentInstructions(WebDriver driver) {

		WebElement getPaymentInstructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return getPaymentInstructions;
	}

	public static WebElement getCurrency(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
		return element;
	}

	public static List<WebElement> getCurrencyLabel(WebDriver driver) {
		List<WebElement> currencyList = new ArrayList();
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
		return currencyList;
	}

	public static WebElement getBtnAddBankAccount(WebDriver driver) {

		WebElement getBtnAddBankAccount = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return getBtnAddBankAccount;
	}

	public static WebElement getBtnSave(WebDriver driver) {

		WebElement btnSave = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return btnSave;
	}

	// SET

	public static void SetBusinessName(WebDriver driver, String businessName) {

		getBusinessName(driver).sendKeys(businessName);
	}

	public static void SetCountries(WebDriver driver, String countries) {

		Actions builder = new Actions(driver);
		Actions countries1 = builder.moveToElement(getCountries(driver));
		countries1.click();
		countries1.sendKeys(countries);
		countries1.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		countries1.perform();
	}

	public static void SetCity(WebDriver driver, String city) {

		getCity(driver).sendKeys(city);
	}

	public static void SetStreet(WebDriver driver, String street) {

		getStreet(driver).sendKeys(street);
	}

	public static void SetZip(WebDriver driver, String zip) {

		getZip(driver).sendKeys(zip);
	}

	public static void SetRegistryNumber(WebDriver driver, String registryNumber) {

		getRegistryNumber(driver).sendKeys(registryNumber);
	}

	public static void SetAddBankAccount(WebDriver driver) {

		getAddBankAccount(driver).click();
	}

	public static void SetBankName(WebDriver driver, String bankName) {

		getBankName(driver).sendKeys(bankName);
	}

	public static void SetAccountNumber(WebDriver driver, String accountNumber) {

		getAccountNumber(driver).sendKeys(accountNumber);
	}

	public static void SetSwiftNumber(WebDriver driver, String swiftNumber) {

		getSwiftNumber(driver).sendKeys(swiftNumber);
	}

	public static void SetPaymentInstructions(WebDriver driver, String paymentInstruction) {

		getPaymentInstructions(driver).sendKeys(paymentInstruction);
	}

	public static void addCurrency(WebDriver driver, String currencyName) {
		Actions builder = new Actions(driver);
		WebElement currencyList = getCurrency(driver);
		Actions currency = builder.moveToElement(currencyList).click();
		currency.perform();
		List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
		for (WebElement e : CurrencyLabel) {
			if (e.getText().equals(currencyName)) {
				e.click();
			}
		}
	}

	public static void SetBtnAddBankAccount(WebDriver driver) {

		getBtnAddBankAccount(driver).click();
	}

	public static void SetBtnSave(WebDriver driver) {

		getBtnSave(driver).click();
	}

}
