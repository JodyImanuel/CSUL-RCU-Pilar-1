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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/SPV-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_b2-l1-17_10-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_b2-l1-17_10-b4-l1-44_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/a_Copy Contract'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/input_b3-b1-b1-Input_StartDate3'), 
    '20-07-2026')

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/input_b3-b1-b1-Input_StartDate4'), 
    '20-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/select_b3-b1-b1-Dropdown2'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/select_b3-b1-b1-Dropdown5'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutCopyContract/button_Tindak Lanjut'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContractDetail/button_Tindak Lanjut'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetailCopyContract/select_b3-l1-378_0-b2-TindakLanjutStatus'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetailCopyContract/textarea_b3-l1-378_0-b2-TextArea_HasilCatatan'), 
    'selesai ya')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutDocumentDetailCopyContract/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutCopyContractDetail/button_Tindak Lanjut'))

