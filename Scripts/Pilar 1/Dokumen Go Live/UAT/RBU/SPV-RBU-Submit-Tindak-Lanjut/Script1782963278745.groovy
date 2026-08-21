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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/SPV-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_b2-l1-16_10-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_b2-l1-16_10-b4-l1-44_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/a_Dokumen Golive'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/input_b3-b2-b1-Input_StartDate3'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/input_b3-b2-b1-Input_StartDate4'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/select_b3-b2-b1-Dropdown2'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/select_b3-b2-b1-Dropdown5'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjut/button_Tindak Lanjut'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDetail/button_Tindak Lanjut'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetail/button_Lihat Dokumen'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetail/select_b3-l1-787_0-b2-TindakLanjutStatus'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetail/textarea_b3-l1-787_0-b2-TextArea_HasilCatatan'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetail/button_Submit'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDetail/button_Tindak Lanjut'))

