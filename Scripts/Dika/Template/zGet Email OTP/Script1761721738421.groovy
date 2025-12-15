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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.osacademy.net/PPULMSStudent/Login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email_b3-Input_Email'), 'mdikagunawan@ppu.co.id')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Email_btn border-radius-space-s btn-_d660d7'))

currentWindow = WebUI.getWindowIndex()

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('mail.ppu.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Roundcube Webmail  Welcome to Roundcub_b6e181/input_Username_rcmloginuser'), 
    'mdikagunawan@ppu.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Roundcube Webmail  Welcome to Roundcub_b6e181/input_Password_rcmloginpwd'), 
    'vupfg9gbLCctBNdZAziThA==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Roundcube Webmail  Welcome to Roundcub_b6e181/button_Password_rcmloginsubmit'))

WebUI.click(findTestObject('Object Repository/Page_(233) Roundcube Webmail  Inbox/span Email LMS PPU'))

getOTP = WebUI.getText(findTestObject('Object Repository/Page_(234) Roundcube Webmail  Inbox/span_Please login using this One Time PIN_v_c705ad'))

WebUI.switchToWindowIndex(currentWindow)

WebUI.setText(findTestObject('Object Repository/Page_OTP/input_mdikagunawanppu.co.id_b2-Input_OTP'), getOTP)

WebUI.doubleClick(findTestObject('Object Repository/Page_OTP/button_Verify OTP'))

