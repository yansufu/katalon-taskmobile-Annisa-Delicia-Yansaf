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

Mobile.tap(findTestObject('Product screen/btn_cart'), 0)

Mobile.waitForElementPresent(findTestObject('Cart screen/title_Shopping Cart'), 0)

Mobile.tap(findTestObject('Cart screen/btn_CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout screen/title_Checkout'), 0)

Mobile.tap(findTestObject('Checkout screen/input_Name'), 0)

Mobile.setText(findTestObject('Checkout screen/input_Name'), 'Jane Doe', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Checkout screen/input_Name'), 0)

trimOriginalString = 'Jane Doe'

Mobile.verifyElementText(findTestObject('Checkout screen/input_Name'), trimOriginalString)

Mobile.tap(findTestObject('Checkout screen/input_email'), 0)

Mobile.setText(findTestObject('Checkout screen/input_email'), 'janedoe@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Checkout screen/input_email'), 0)

trimOriginalString = 'janedoe@gmail.com'

Mobile.verifyElementText(findTestObject('Checkout screen/input_email'), trimOriginalString)

Mobile.tap(findTestObject('Checkout screen/input_phone number'), 0)

Mobile.setText(findTestObject('Checkout screen/input_phone number'), '0812345678900', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Checkout screen/input_phone number'), 0)

trimOriginalString = '0812345678900'

Mobile.verifyElementText(findTestObject('Checkout screen/input_phone number'), trimOriginalString)

Mobile.tap(findTestObject('Checkout screen/input_Address'), 0)

Mobile.setText(findTestObject('Checkout screen/input_Address'), 'Jane Doe\'s address', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Checkout screen/input_Address'), 0)

trimOriginalString = 'Jane Doe\'s address'

Mobile.verifyElementText(findTestObject('Checkout screen/input_Address'), trimOriginalString)

Mobile.tap(findTestObject('Checkout screen/dropdown_shipping'), 0)

Mobile.tap(findTestObject('Checkout screen/dropdown menu_TNT Express'), 0)

Mobile.tap(findTestObject('Checkout screen/btn_PROCESS CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout screen/txt_Are you sure want to checkout'), 0)

Mobile.tap(findTestObject('Checkout screen/btn_YES'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout screen/txt_Congratulation'), 0)

Mobile.tap(findTestObject('Checkout screen/btn_OK'), 0)

