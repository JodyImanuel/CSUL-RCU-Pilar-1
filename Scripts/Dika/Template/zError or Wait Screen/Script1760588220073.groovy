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

//objectScreenError = CustomKeywords.'myPack.createXpath.createTestObject'('//*[contains(@id, \'error-screen-message-reload-button\')]')

objectScreenError = WebUI.modifyObjectProperty(findTestObject('xpath dynamic'), 'xpath', 'equals', '//*[contains(@id, \'error-screen-message-reload-button\')]', 
    true)

elementPresent = (WebUI.verifyElementPresent(waitElement, 2, FailureHandling.OPTIONAL) || WebUI.verifyElementPresent(objectScreenError, 
    2, FailureHandling.OPTIONAL))

while (elementPresent == false) {
    elementPresent = (WebUI.verifyElementPresent(waitElement, 2, FailureHandling.OPTIONAL) || WebUI.verifyElementPresent(
        objectScreenError, 2, FailureHandling.OPTIONAL))
}

errorScreen = WebUI.verifyElementPresent(objectScreenError, 2, FailureHandling.OPTIONAL)

while (errorScreen == true) {
    elementPresent = false

    WebUI.enhancedClick(objectScreenError)

    WebUI.delay(10)

    while (elementPresent == false) {
        elementPresent = (WebUI.verifyElementPresent(waitElement, 2, FailureHandling.OPTIONAL) || WebUI.verifyElementPresent(
            objectScreenError, 2, FailureHandling.OPTIONAL))
    }
    
    errorScreen = WebUI.verifyElementPresent(objectScreenError, 2, FailureHandling.OPTIONAL)
}

