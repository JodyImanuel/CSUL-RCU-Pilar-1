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

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/div_b2-l1-17_8-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/div_b2-l1-17_8-b4-l1-26_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Assign-Staff/Page_Dashboard/a_Showroom_Supplier'))

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/input_StartDate'), 
    '01-01-2024')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/input_EndDate'), 
    '31-03-2024')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/select_Dropdown Branch'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Assign-Staff/Page_KunjunganShowroom/select_b3-b1-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/button_Cek Jarak'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/input_b3-b1-l1_0-236_0-Checkbox2'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/button_Assign'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/button_Assign_PopUp'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Assign-Staff/Page_KunjunganShowroom/select_b3-b1-b1-Dropdown3'), 
    '1', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Assign_Staff/Page_KunjunganShowroom/button_Cari'))

