package pageObjects;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.DateTimeUtils;

public class ClientsPage {

	// GET

	public static WebElement clickAddNewClient(WebDriver driver) {

		WebElement clickAddNewClient = driver.findElement(By.xpath(
				"//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return clickAddNewClient;
	}

	public static WebElement getClientName(WebDriver driver) {

		WebElement getClientName = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getClientName;

	}

	public static WebElement getContactName(WebDriver driver) {

		WebElement getContactName = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getContactName;

	}

	public static WebElement getEmail(WebDriver driver) {

		WebElement getEmail = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return getEmail;

	}

	public static WebElement getClientRegistryNumber(WebDriver driver) {

		WebElement getClientRegistryNumber = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getClientRegistryNumber;

	}

	public static WebElement getClientCountry(WebDriver driver) {

		WebElement getClientCountry = driver
				.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return getClientCountry;
	}

	public static WebElement getClientCity(WebDriver driver) {

		WebElement getClientCity = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getClientCity;
	}

	public static WebElement getClientStreet(WebDriver driver) {

		WebElement getClientStreet = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getClientStreet;
	}

	public static WebElement getClientZip(WebDriver driver) {

		WebElement getClientZip = driver.findElement(By.xpath(
				"//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getClientZip;
	}

	public static WebElement getDateAdded(WebDriver driver) {

		WebElement getDateAdded = driver.findElement(
				By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
		return getDateAdded;

	}

	public static WebElement getMonthsForward(WebDriver driver) {

		WebElement forward = driver.findElement(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-picker v-card v-picker--date']//div[@class='v-picker__body']//div//i[@class='v-icon material-icons'][contains(text(),'chevron_right')]"));
		return forward;
	}

	public static WebElement getMonthsBackward(WebDriver driver) {

		WebElement backward = driver.findElement(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-picker v-card v-picker--date']//div[@class='v-picker__body']//div//i[@class='v-icon material-icons'][contains(text(),'chevron_left')]"));
		return backward;
	}

	public static WebElement getOkCalendar(WebDriver driver) {

		WebElement okCalendar = driver.findElement(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-btn__content'][contains(text(),'OK')]"));
		return okCalendar;
	}

	public static WebElement getCode(WebDriver driver) {

		WebElement getCode = driver
				.findElement(By.xpath("//div[@class='v-input code-field v-text-field']//input[@type='text']"));
		return getCode;

	}

	public static WebElement getAgreementDate(WebDriver driver) {

		WebElement getAgreementDate = driver
				.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
		return getAgreementDate;

	}

	public static WebElement getStatus(WebDriver driver) {

		WebElement getStatus = driver
				.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
		return getStatus;

	}

	public static WebElement getStatusLabel(WebDriver driver) {
		WebElement getStatusLabel = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
		return getStatusLabel;
	}

	public static WebElement getBtnSave(WebDriver driver) {

		WebElement btnSave = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));

		return btnSave;

	}

	// SET

	public static void SetClientName(WebDriver driver, String clientName) {

		getClientName(driver).sendKeys(clientName);

	}

	public static void SetContactName(WebDriver driver, String contactName) {

		getContactName(driver).sendKeys(contactName);

	}

	public static void SetEmail(WebDriver driver, String email) {

		getEmail(driver).sendKeys(email);

	}

	public static void SetClientRegistryNumber(WebDriver driver, String cRegistryNumber) {

		getClientRegistryNumber(driver).sendKeys(cRegistryNumber);

	}

	public static void SetClientCountry(WebDriver driver, String cCountry) {

		Actions builder = new Actions(driver);
		Actions country1 = builder;
		country1.moveToElement(getClientCountry(driver));
		country1.click();
		country1.sendKeys(cCountry);
		country1.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country1.perform();
	}

	public static void SetClientCity(WebDriver driver, String cCity) {

		getClientCity(driver).sendKeys(cCity);

	}

	public static void SetClientStreet(WebDriver driver, String cStreet) {

		getClientStreet(driver).sendKeys(cStreet);

	}

	public static void SetClientZip(WebDriver driver, String cZip) {

		getClientZip(driver).sendKeys(cZip);

	}

	public static void SetDateAdded(WebDriver driver, String dateAdded) throws InterruptedException {

		getDateAdded(driver).click();
		Thread.sleep(1000);
		LocalDate ld = DateTimeUtils.StringToDate(dateAdded);
		int monthsBetween = DateTimeUtils.MonthsBetweenTwoDates(LocalDate.now(), ld);
		if (monthsBetween >= 0) {
			for (int i = 0; i < monthsBetween; i++) {
				getMonthsForward(driver).click();
				Thread.sleep(1000);
			}
		} else {
			for (int i = 0; i > monthsBetween; i--) {
				getMonthsBackward(driver).click();
				Thread.sleep(1000);
			}
		}
		String day = Integer.toString(ld.getDayOfMonth());
		// contains(text(),'10')
		String relXPathToRow = String.format("//*[contains(text(),'%s')]", day);
		List<WebElement> lwe = driver.findElements(By.xpath(relXPathToRow));
		lwe.get(lwe.size() - 1).click();
		Thread.sleep(1000);
		System.out.println("Kliknuo na datum");
		getOkCalendar(driver).click();
		Thread.sleep(1000);

	}

	public static void SetCode(WebDriver driver, String code) {

		getCode(driver).sendKeys(code);

	}

	public static void SetAgreementDate(WebDriver driver, String agreementDate) {

		getAgreementDate(driver).sendKeys(agreementDate);

	}

	public static void SetStatus(WebDriver driver, String status) {

		String currentStatus = getStatusLabel(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if (!status.equals(cs)) {
			getStatus(driver).click();
		}

	}

	public static void SetSave(WebDriver driver) {

		getBtnSave(driver).click();
	}
}
