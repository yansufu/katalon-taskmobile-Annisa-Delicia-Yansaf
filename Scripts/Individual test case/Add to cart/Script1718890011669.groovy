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

WebUI.callTestCase(findTestCase('Test case for test suites/Start application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home screen/Products/txt_Samsung Galaxy S10 - Black'), 0)

Mobile.waitForElementPresent(findTestObject('Product screen/btn_ADD TO CART'), 0)

Mobile.tap(findTestObject('Product screen/btn_ADD TO CART'), 0)

Mobile.waitForElementPresent(findTestObject('Product screen/input_Number of Order'), 0)

Mobile.setText(findTestObject('Product screen/input_Number of Order'), '1', 0)

Mobile.tap(findTestObject('Product screen/btn_ADD'), 0)

Mobile.tap(findTestObject('Product screen/btn_cart'), 0)

Mobile.waitForElementPresent(findTestObject('Cart screen/container_product list'), 0)

Mobile.tap(findTestObject('Cart screen/btn_back'), 0)

Mobile.waitForElementPresent(findTestObject('Product screen/btn_ADD TO CART'), 0)

Mobile.tap(findTestObject('Product screen/btn_back'), 0)

Mobile.waitForElementPresent(findTestObject('Home screen/title_E-Commerce Android App'), 0)

WebUI.callTestCase(findTestCase('Test case for test suites/End application'), [:], FailureHandling.STOP_ON_FAILURE)

