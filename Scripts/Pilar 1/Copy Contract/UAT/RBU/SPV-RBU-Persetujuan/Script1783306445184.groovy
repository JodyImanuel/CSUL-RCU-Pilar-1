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

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_b2-l1-17_9-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_b2-l1-17_9-b4-l1-35_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_Dashboard/a_Copy Contract'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/input_b3-b1-Input_StartDate'), 
    '21-07-2026')

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/input_b3-b1-Input_StartDate2'), 
    '21-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/select_b3-b1-Dropdown1'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/select_b3-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/button_Persetujuan'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContractDetail/Page_ApprovalCopyContractDetail/button_Lihat Dokumen'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContractDetail/select_b3-b9-Status2'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContractDetail/textarea_b3-b9-TextArea_Catatan'), 
    'testing ya')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContractDetail/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/select_b3-b1-Dropdown3'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalCopyContract/button_Cari'))

