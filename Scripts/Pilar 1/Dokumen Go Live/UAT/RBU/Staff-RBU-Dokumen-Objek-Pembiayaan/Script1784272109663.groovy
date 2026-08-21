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

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b4-l1-23_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/a_Dokumen Golive'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate2'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/select_b3-b2-b1-Dropdown3'), 
    '1', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/action'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/div_Pemeriksaan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/div_Accordion_DokumenObjek_Pembiayaan'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_0-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_0-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_1-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_1-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700__1'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_2-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_2-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700__2'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_3-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_3-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700__3'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_4-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_4-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700__4'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_5-'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/select_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700_5-_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/textarea_b3-l2-538_1-b8-b1-l1-699_0-b1-l4_0-700__5'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/button_b3-ButtonDraftRBU'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/RBU/Staff-RBU-Dokumen-Objek-Pembiayaan/Page_DokumenChecking/button_Next_1'))

