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

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_b2-l1-17_9-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_b2-l1-17_9-b4-l1-35_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/a_Dokumen Golive'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/input_b3-b1-Input_StartDate'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/input_b3-b1-Input_StartDate2'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/select_b3-b1-Dropdown1'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/select_b3-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/button_search'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/button_Persetujuan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_Next'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_Next'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_Next'))

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_Next_GoToTAB_Survey'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/input_CheckboxSurvey'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/select_b3-l2-316_3-b10-Status'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/select_b3-l2-316_3-b10-Action'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/textarea_b3-l2-316_3-b10-TextArea_Catatan'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_Submit'))

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/select_Status_TAB_Survey'), 
    '0', false)

not_run: WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/textarea_Catatan_TAB_Survey'), 
    'Okay survei sudah dilakukan, saya approved dan akan tindak lanjut')

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKreditDetail/button_SubmitTAB_SurveyWeb'))

WebUI.delay(5)

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/select_b3-b1-Dropdown3'), 
    '1', false)

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKelengkapanKredit/button_search'))

