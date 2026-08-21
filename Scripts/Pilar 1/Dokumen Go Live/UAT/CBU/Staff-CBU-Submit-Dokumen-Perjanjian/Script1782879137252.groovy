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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/Staff-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b3-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/div_b2-l1-16_3-b4-l1-23_4-b1-SubMenuHeader'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_Dashboard/a_Dokumen Golive'))

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate'), 
    '22-07-2026')

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/input_b3-b2-b1-Input_StartDate2'), 
    '22-07-2026')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/select_b3-b2-b1-Dropdown1'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/select_b3-b2-b1-Dropdown3'), 
    '1', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/button_Cari'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/action'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/div_Pemeriksaan'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/i_icon accordion-icon-dokumen-perjanjian'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_0'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_0_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_1'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_1_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_1'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_2'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_2_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_2'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_3'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_3_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_3'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_4'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_4_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_4'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_5'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_5_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_5'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_6'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_6_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_6'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_7'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_7_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/textarea_b3-l2-177_3-b11-b2-l1-537_0-b1-l4_0-538_7'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/select_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447_8'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/select_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447_8_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/textarea_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/select_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447_9'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/select_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447_9_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/Page_DokumenChecking/textarea_b3-l2-172_3-b11-b2-l1-446_0-b1-l4_0-447_1'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/Page_DokumenChecking/input_Survey Pengurus_Checkbox'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/button_Submit'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/button_Submit_popup'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/select_b3-b2-b1-Dropdown3'), 
    '2', false)

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_KelengkapanKredit/button_Cari'))

