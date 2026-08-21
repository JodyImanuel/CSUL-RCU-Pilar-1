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

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_Dashboard/div_b2-l1-17_10-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_Dashboard/div_b2-l1-17_10-b4-l1-44_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_Dashboard/a_Showroom_Supplier'))

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/input_StartDate'), 
    '21-07-2026')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/input_EndDate'), 
    '21-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/select_DropdownCabang'), 
    '2', false)

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV-CBU-Persetujuan/Page_ApprovalKunjunganShowroom/select_Select Status'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/button_Tindak lanjut'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/select_Dropdown_Kategori_Temuan'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/Page_TindakLanjutKunjunganShowroomDetail/button_Lihat Dokumen'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/Page_TindakLanjutKunjunganShowroomDetail/select_category_status'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/Page_TindakLanjutKunjunganShowroomDetail/textarea_Catatan_TindakLanjut'), 
    'Saya selesaikan ya sudah bagus')

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroomDetail/Page_TindakLanjutKunjunganShowroomDetail/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/button_Tindak lanjut'))

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroom/select_JenisSearch_ByTask ID'), 
    '0', false)

not_run: WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Submit_Tindak_Lanjut/Page_TindakLanjutKunjunganShowroom/input_Pencarian_By_TaskId'), 
    'CBU/P1.3/07/26/014')

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/SPV_CBU_Assign_PIC/Page_TindakLanjutKunjunganShowroom/button_Cari'))

