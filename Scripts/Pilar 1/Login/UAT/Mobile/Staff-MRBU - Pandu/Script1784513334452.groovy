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
import com.kms.katalon.core.testobject.ObjectRepository as OR
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Membuka browser
WebUI.openBrowser('https://sakti-test.csulfinance.com/CSUL_RCU_MOBILE/Login')

// Isi username
WebUI.setText(findTestObject('Pilar 1/Login/UAT/Mobile/Page_Login/input_Username'), 'pandu.sastra')

// Isi password
WebUI.setEncryptedText(findTestObject('Pilar 1/Login/UAT/Mobile/Page_Login/input_Password'), 'DKZg8gTnVzw=')

WebUI.delay(10)

// Klik Login
WebUI.click(findTestObject('Pilar 1/Login/UAT/Mobile/Page_Login/button_Log In'))

