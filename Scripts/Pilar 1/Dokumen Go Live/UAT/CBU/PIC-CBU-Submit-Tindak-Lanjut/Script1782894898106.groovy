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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/PIC-Fatimah'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_Dashboard/div_b2-l1-16_1-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_Dashboard/div_b2-l1-16_1-b4-l1-22_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_Dashboard/a_Dokumen Golive'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/select_b3-b1-b1-BisnisUnit'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/select_b3-b1-b1-Dropdown1'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/select_b3-b1-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/button_Tindak Lanjut'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/input_b3-b2-l3-187_0-l3-188_0-b5-l5_0-189_0-Input'), 
    '31-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/textarea_b3-b2-l3-187_0-l3-188_0-b5-l5_0-189_0-T'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/button_Unggah'))

WebUI.delay(7)

not_run: WebUI.uploadFile(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/div_b3-b2-l3-187_0-l3-188_0-b5-b3-dropzone'), 
    Lorem)

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/button_Upload'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjutDetail/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/select_b3-b1-b1-Dropdown3'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/PIC-CBU-Submit-Task/Page_TindakLanjut/button_Cari'))

