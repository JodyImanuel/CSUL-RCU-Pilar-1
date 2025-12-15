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
import org.openqa.selenium.Keys
import org.supercsv.cellprocessor.ParseInt
import org.supercsv.cellprocessor.ParseInt as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://netpaser.com/PerkasaUniversityLearningApp/LoginAdmin')

WebUI.setText(findTestObject('Object Repository/Page_LoginAdmin/input_Username_Input_UsernameVal'), 'elearning_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LoginAdmin/input_Password_Input_PasswordVal'), 'WfTtcpl+qDbSWTaT2EaR3A==')

WebUI.doubleClick(findTestObject('Object Repository/Page_LoginAdmin/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Skills/div_Admin'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Skills/a_Lessons'))

Boolean paginationClickable = WebUI.verifyElementClickable(findTestObject('Page_Production Order/button_items_pagination-button'), FailureHandling.OPTIONAL)

while (paginationClickable == true) {
	WebUI.doubleClick(findTestObject('Object Repository/Page_Lessons/button__pagination-button'))

	paginationClickable = WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Lessons/button__pagination-button'),
		FailureHandling.OPTIONAL)
}

xpath = "//tr[last()]/td[5]/button/div"

Boolean tablePresent = false //true

int i = 0

while (tablePresent == true) {
	i++

	tablePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Lessons/span_zTest Feedback', [('i') : i]),
		2, FailureHandling.OPTIONAL)
}

i--

autoGenerateNumber = WebUI.getText(findTestObject('Object Repository/Page_Lessons/span_zTest Feedback', [('i') : i]))
println(autoGenerateNumber)

lastWord = autoGenerateNumber.substring(autoGenerateNumber.lastIndexOf(' ') + 1)
println(lastWord)

lastWord = Integer.parseInt(lastWord)
println(lastWord)

lastWord++
println(lastWord)


WebUI.waitForElementPresent(findTestObject('Page_CreateEditLesson/select_(Select Type)VideoQuizExerciseFeedback'), 0)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_CreateEditLesson/select_(Select Type)VideoQuizExerciseFeedback'),
	'Feedback', true)

WebUI.setText(findTestObject('Object Repository/Page_CreateEditLesson/input_Name_Input_Name'), 'zTest Feedback ' + lastWord)

WebUI.setText(findTestObject('Object Repository/Page_CreateEditLesson/input_Order_Input_Order'), '' + lastWord)

WebUI.takeFullPageScreenshotAsCheckpoint('Form Create Lesson')

WebUI.doubleClick(findTestObject('Object Repository/Page_CreateEditLesson/button_Save'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CreateEditLesson/button_OK'))

Map m = [('pagination') : paginationClickable, ('table') : tablePresent, ('i') : i, ('textLesson') : textLesson, ('lastWord') : lastWord]

return m

