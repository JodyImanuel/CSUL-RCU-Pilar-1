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

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/div_b2-l1-17_8-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/div_b2-l1-17_8-b4-l1-26_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/a_Copy Contract'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/input_b3-b1-b1-Input_StartDate'), 
    '10-10-2020')

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/input_b3-b1-b1-Input_StartDate2'), 
    '10-12-2020')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/select_b3-b1-b1-DropdownCabang'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/select_b3-b1-b1-DropdownStatus'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/input_b3-b1-l1_0-239_0-Checkbox2'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/button_Assign'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/button_Assign_popup'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/select_b3-b1-b1-DropdownStatus'), 
    '1', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/SPV-CBU-Assign-Staff/Page_PengirimanCopyContract/button_Cari'))

