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

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/div_b2-l1-17_1-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/div_b2-l1-17_1-b4-l1-23_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/a_Copy Contract'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/select_b3-b2-b1-BisnisUnit'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/select_b3-b2-b1-Dropdown1'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/select_b3-b2-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/button_Cari'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/input_b3-b2-l2_0-113_0-Input_TenggatWaktuPenyeles'), 
    '31-07-2026')

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/textarea_b3-b2-l2_0-113_0-TextArea_TindakLanjut'), 
    'sudah bisa dilanjut ya')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/button_Unggah'))

WebUI.delay(5)

not_run: WebUI.uploadFile(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/div_b3-b2-b6-dropzone'), 
    Lorem)

not_run: WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/button_Upload'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/select_b3-b2-b1-Dropdown1'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/select_b3-b2-b1-Dropdown3'), 
    '2', false)

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/Page_TindakLanjutCopyContract/select_Pencarian'), 
    '0', false)

not_run: WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/Page_TindakLanjutCopyContract/input_Pencarian'), 
    '11102003404')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContract/button_Cari'))

