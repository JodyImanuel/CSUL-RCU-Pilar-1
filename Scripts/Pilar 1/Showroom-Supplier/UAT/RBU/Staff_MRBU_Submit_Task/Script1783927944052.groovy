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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/Mobile/Staff-MRBU - Pandu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_Home/div_HomeStaff'), 
    5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_Home/span_Kunjungan Showroom'))

not_run: WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroom/input_TextSearch'), 
    'RBU/P1.3/07/26/004')

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroom/div_IconSearch'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroom/div_KUNJUNGAN SHOWROOMRBU_P1.3_07_26_011'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomDetail/input_b3-Checkbox1'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomDetail/button_Survey'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_FormFotoKunjungan'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_Ambil Foto1'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_kamera1'))

WebUI.switchToWindowTitle('KunjunganShowroomQuestionAnswer')

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Sesuai_1'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_Ambil Foto2'))

WebUI.delay(7)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Tidak Sesuai_1'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_Ambil Foto3'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_kamera3'))

WebUI.switchToWindowTitle('KunjunganShowroomQuestionAnswer')

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Sesuai_2'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_Ambil Foto_4'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Tidak Sesuai_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_FormHasilKunjungan'))

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Nama Sumber Informasi 1 _'), 
    'Nathan')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Jabatan Sumber Informasi 1_1'), 
    'Adik')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Nama Sumber Informasi 2 _'), 
    'Nadia')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Jabatan Sumber Informasi 2_2'), 
    'Ibu')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Nama Sumber Informasi 3 __1'), 
    'Nuri')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/input_Jabatan Sumber Informasi 3'), 
    'Sepupu')

WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/textarea_Hasil Pemeriksaan RCU'), 
    'Tidak sesuai')

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/div_Unggah'))

WebUI.delay(7)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/select_Kategori Temuan'), 
    '1', false)

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/button_Submit'))

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroomQuestionAnswer/button_Submit_PopUp'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_Home/span_Kunjungan Showroom'))

not_run: WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroom/input_TextSearch'), 
    'RBU/P1.3/07/26/004')

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/RBU/Staff_MRBU_Submit_Task/Page_KunjunganShowroom/div_IconSearch'))

