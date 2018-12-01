package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = "REGRESSION", priority = 1)
	public void testVerifyHomePage() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.AB_TEST_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = "REGRESSION", priority = 2)
	public void testVerifyHomePage2() {
		boolean flag;
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.CHECK_BOX_LINK);

		CheckBoxPage.waitTillHeaderLoad();
		softAssert.assertTrue(CheckBoxPage.isCheckBoxPageDisplayed(), "Checkbox Page is not Displayed");

		CheckBoxPage.isCheckBox1Available();
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Available(), "Checkbox1 is not Available");


		CheckBoxPage.isCheckBox2Available();
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Available(), "Checkbox2 is not Available");

		flag = CheckBoxPage.isCheckBox2Selected();
		softAssert.assertTrue(flag, "Checkbox2 is not Selected");

		flag = CheckBoxPage.isCheckBox1Selected();
		softAssert.assertFalse(flag, "Checkbox1 is Selected"); //Assert false is used to check whether the checkbox is NOT SELECTED or Not.

		CheckBoxPage.slectCheckbox1();
		flag = CheckBoxPage.isCheckBox1Selected();
		softAssert.assertTrue(flag, "Checkbox1 is Selected"); //Assert false is used to check whether the checkbox is NOT SELECTED or Not.

		CheckBoxPage.navigateBack();

		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
		//Todo - Click Home Page Link
		//Todo - Static wait
		//Todo - Wait Till Page Loads
		//Todo - Static wait
		//Todo - Verify ABTest Page is displayed
		//Todo - Static wait
		//Todo - Navigate Back to Home Page
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = "REGRESSION", priority = 3)
	public void testVerifyCheckBox() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Check Box Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Check Box 1 is displayed
        //Todo - Verify Check Box 2 is displayed
        //Todo - Check Check Box 1
        //Todo - Verify Check Box 1 is Checked
        //Todo - Uncheck Check Box 1
        //Todo - Verify Check Box 1 is Unchecked
        //Todo - Check Check Box 2
        //Todo - Verify Check Box 2 is Checked
        //Todo - Uncheck Check Box 2
        //Todo - Verify Check Box 2 is Unchecked
        //Todo - Navigate Back to Home Page
        //Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = "REGRESSION", priority = 4)
	public void testVerifyDropDown() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Drop Down Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Drop Down is displayed
        //Todo - Select Drop Down Option 1
        //Todo - Verify Drop Down Option 1 selected
        //Todo - Select Drop Down Option 2
        //Todo - Verify Drop Down Option 2 selected
	}

	/**
	 * Verify Forgot Password
	 */
	@Test(groups = "REGRESSION", priority = 5)
	public void testVerifyForgotPassword() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Forgot Password Link
        //Todo - Set Sample Mail
        //Todo - Click Submit
        //Todo - Verify Forgot Password Message
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "REGRESSION", priority = 6)
	public void testVerifyLogin() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Secure Page Displayed
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message
        //Todo - Click Logout
        //Todo - Verify Login Page Displayed
        //Todo - Verify Logout Alert Displayed
        //Todo - Verify Logout  Alert Message
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = "REGRESSION", priority = 7, dataProvider = "MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyLogin(String username, String password) {
        //TODO- SAME ACTION SHOULD BE REPEATED FOR MULTIPLE USERS
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Invalid Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message
	}
}
