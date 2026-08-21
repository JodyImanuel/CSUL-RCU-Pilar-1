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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

String today = new SimpleDateFormat('dd-MM-yyyy').format(new Date())

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/Staff-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b4-l1-23_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/a_Dokumen Golive'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate2'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/select_b3-b2-b1-Dropdown3'), 
    '0', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/action'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/div_Pemeriksaan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/i_icon accordion-perorangan'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_0-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_0-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_1-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_1-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__1'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_2-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_2-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__2'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_3-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_3-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__3'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_4-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_4-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__4'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_5-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_5-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__5'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_6-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_6-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__6'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_7-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_7-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__7'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_8-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_8-_1'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_8-_2'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__8'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Unggah'))

WebUI.delay(5)

not_run: WebUI.uploadFile(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/div_b3-l2-180_0-b8-b1-l1-266_0-b1-b4-dropzone'), 
    Lorem)

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Upload'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_9-'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/select_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267_9-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/textarea_b3-l2-180_0-b8-b1-l1-266_0-b1-l4_0-267__9'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Unggah_1'))

WebUI.delay(5)

not_run: WebUI.uploadFile(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/div_b3-l2-180_0-b8-b1-l1-266_0-b1-b4-dropzone'), 
    Lorem)

not_run: WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Upload'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_b3-ButtonDraftRBU'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

