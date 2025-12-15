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

TestData data = findTestData('Login')

int totalRow = data.getRowNumbers()

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl(
	'https://sakti-sandbox.csulfinance.com/CSULFoundation_Login/Login?RedirectURL=https%3A%2F%2Fsakti-sandbox.csulfinance.com%2FCSUL_RCU%2FMasterDokumen'
)

for (int i = 1; i <= totalRow; i++) {

    String username = data.getValue('Username', i)

    WebUI.setText(
        findTestObject('Object Repository/Pilar 1/Sprint 1/Login/input_Username_Input_UsernameVal'),
        username
    )

    WebUI.setEncryptedText(
        findTestObject('Object Repository/Pilar 1/Sprint 1/Login/input_Password_Input_PasswordVal'),
        'DKZg8gTnVzw='
    )

    WebUI.click(findTestObject('Object Repository/Pilar 1/Sprint 1/Login/button_Login'))

    // === logout ===
    WebUI.click(findTestObject('Object Repository/Pilar 1/Sprint 1/Login/i_Ops Risk CBU Supervisor_icon fa fa-chevro_4c05ba'))
    WebUI.click(findTestObject('Object Repository/Pilar 1/Sprint 1/Login/a_Sign Out'))

}

WebUI.closeBrowser()