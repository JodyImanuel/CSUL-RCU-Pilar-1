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

WebUI.waitForElementVisible(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_Home/div_HomeStaff'), 
    5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_Home/span_Survey Kunjungan'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjungan/input_Input_TextSearch'), 
    '11102003346')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjungan/i_icon_Search'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjungan/div_SURVEY KUNJUNGANCBU_P1.1_07_26_007'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjunganDetail/button_Start Survey'))

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjunganDetail/button_Lanjutkan Survey'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyAppointment/input_Checklist_Data_Confins'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyAppointment/button_Survey'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Accordion_SumberInformasi'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Nama Sumber Informasi 1 __1'), 
    'Aurel')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Hubungan sumber informasi 1 dengan custom'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Ya'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Nama Sumber Informasi 2 _'), 
    'Mira')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Hubungan sumber informasi 2 dengan custom'), 
    '1', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Ya_1'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Nama Sumber Informasi 3 _'), 
    'Tio')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Hubungan sumber informasi 3 dengan custom'), 
    '9', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Ya_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Accordion_FotoKunjungan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Ambil Foto_1'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Kamera1'))

WebUI.switchToWindowTitle('SurveyQuestionAnswer')

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Sesuai'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Ambil Foto_2'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Kamera2'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Tidak Sesuai'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Ambil Foto_3'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Kamera3'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Sesuai_1'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Ambil Foto_4'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Kamera4'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Tidak Sesuai_1'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Ambil Foto_5'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Sesuai_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/div_Accordion_HasilKunjungan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Sesuai_Alamat'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Sesuai_Telepon'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Jumlah Karyawan_Pekerja'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Kondisi_Aktivitas'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Kondisi Jalan'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Akses Jalan_1'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Bentuk Bangunan_1'), 
    '4', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/input_Lama Usaha_Kerja - RBU'), 
    '5 tahun')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Status Kepemilikan __1'), 
    '1', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/textarea_Catatan Hasil Survey_1'), 
    'Tidak sesuai')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/select_Kategori Temuan_1'), 
    '1', false)

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/button_Draft_RBU'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/button_Submit_RBU'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyQuestionAnswer/button_Submit_PopUpRBU'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjunganDetail/button_SubmitAfter_AllTask'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjungan/input_Input_TextSearch'), 
    '11102003346')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-MCBU-Survey-Submit-Task/Page_SurveyKunjungan/i_icon_Search'))

