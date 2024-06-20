import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.android.AndroidDriver as AndroidDriver

WebUI.callTestCase(findTestCase('Test case for test suites/Start application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Home screen/title_E-Commerce Android App'), 0)

Mobile.tap(findTestObject('Home screen/btn_search'), 0)

Mobile.waitForElementPresent(findTestObject('Home screen/input_search'), 0)

Mobile.setText(findTestObject('Home screen/input_search'), 'Samsung', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Home screen/Products/txt_Samsung Galaxy S10 - Black'), 0)

WebUI.callTestCase(findTestCase('Test case for test suites/End application'), [:], FailureHandling.STOP_ON_FAILURE)

