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

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/i_icon accordion-icon-dokumen-persetujuan-kredit'))

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_0'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_0_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_25'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_26'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_2'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_2_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_27'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_3'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_3_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_28'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_4'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_4_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_29'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_5'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_5_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_30'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_6'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_6_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_31'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_7'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_7_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_32'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_8'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_8_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_33'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_9'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_9_1'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_34'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_2'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_3'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_35'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_4'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_5'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_36'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_6'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_7'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_37'), 
    'testing')

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_8'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Perjanjian/Page_DokumenChecking/select_b3-l2-177_2-b11-b2-l1-328_0-b1-l4_0-329_1_9'), 
    '0', false)

WebUI.setText(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/tambahan-text-area/Page_DokumenChecking/textarea_38'), 
    'testing')

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Draft'))

WebUI.click(findTestObject('Pilar 1/Dokumen Go Live/UAT/CBU/Staff-CBU-Submit-Task/Dokumen-Persyaratan-Kredit/Page_DokumenChecking/button_Next'))

