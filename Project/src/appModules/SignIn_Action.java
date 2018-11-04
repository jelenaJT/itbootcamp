package appModules;

import org.openqa.selenium.WebDriver;

import Utility.Constant;
import Utility.ExcelUtils;
import pageObjects.LogInPage;

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "LogIn");

		String UserName = ExcelUtils.getCellData(1, 0);
		System.out.println(UserName);
		String Password = ExcelUtils.getCellData(1, 1);
		System.out.println(Password);

		LogInPage.txtbx_UserName(driver).sendKeys(UserName);
		LogInPage.txtbx_Password(driver).sendKeys(Password);
		LogInPage.btn_LogIn(driver).click();

	}

}
