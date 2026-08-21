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

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_Dashboard/div_b2-l1-17_9-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_Dashboard/div_b2-l1-17_9-b4-l1-35_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_Dashboard/a_Showroom_Supplier'))

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/input_StartDate'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/input_EndDate'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/select_b3-b1-DropdownCabang'), 
    '4', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/button_Persetujuan'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Lihat Foto'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Lihat Foto_1'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Lihat Foto_2'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Lihat Foto_3'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Lihat Dokumen'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/select_b3-b2-Status2'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/textarea_b3-b2-TextArea_Catatan'), 
    'Baik akan saya approved dan tindak lanjut, thanks')

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroomDetail/button_Submit'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKunjunganShowroom/select_Select Status'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/SPV_RBU_Persetujuan/Page_ApprovalKunjunganShowroom/button_Hasil'))

