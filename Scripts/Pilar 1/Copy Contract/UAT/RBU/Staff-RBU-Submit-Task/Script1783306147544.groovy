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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/Staff-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_Dashboard/div_b2-l1-16_3-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_Dashboard/div_b2-l1-16_3-b4-l1-23_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_Dashboard/a_Copy Contract'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/input_b3-b2-b1-Input_StartDate'), 
    '21-07-2026')

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/input_b3-b2-b1-Input_StartDate2'), 
    '21-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/select_b3-b2-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/button_Pemeriksaan'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/input_b3-b2-l4_0-194_0-Input_PICPengiriman'))

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/input_b3-b2-b16-Input_NamaKaryawan'), 
    'Fatimah AZ')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Pilih'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/select_b3-b2-l4_0-194_0-Dropdown2'), 
    '2', false)

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/input_b3-b2-l4_0-194_0-Input_AirwayBill'), 
    'testing@gmail.com')

WebUI.delay(6)

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/input_b3-b2-l4_0-194_0-Input_NamaPenerima'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/select_b3-b2-l4_0-194_0-Dropdown3'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/textarea_b3-b2-l4_0-194_0-TextArea_Remarks'), 
    'testing ya')

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Unggah'))

WebUI.delay(7)

not_run: WebUI.uploadFile(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/div_b3-b2-b15-dropzone'), 
    Lorem)

not_run: WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Upload_popup'))

not_run: WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/button_Draft_1'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Submit'))

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContractDetail/button_Submit_popup'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/select_b3-b2-b1-Dropdown3'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Copy Contract/UAT/CBU/Staff-CBU-Submit-Task/Page_PengirimanCopyContract/button_Cari'))

