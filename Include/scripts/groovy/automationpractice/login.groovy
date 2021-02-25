package automationpractice
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I Navigate to login page")
	def I_Navigate_to_login_page() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://automationpractice.com/index.php')

		WebUI.click(findTestObject('Page_My Store/Sign In Welcome Page'))
	}

	@When('I login with email adress "(.*)" and password "(.*)"')
	def I_login_with_email_adress_and_password(String emailAdress, String password){
		WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email'), emailAdress)

		WebUI.setText(findTestObject('Page_Login - My Store/input_Password_passwd'), password)

		WebUI.click(findTestObject('Page_Login - My Store/Sign in Button'))
	}

	@Then("I should arrive at My account page")
	def I_should_arrive_at_My_account_page() {
		WebUI.delay(2)

		WebUI.verifyElementVisible(findTestObject('Page_My account - My Store/h1_My account'))
		
		WebUI.closeBrowser()

	}
}