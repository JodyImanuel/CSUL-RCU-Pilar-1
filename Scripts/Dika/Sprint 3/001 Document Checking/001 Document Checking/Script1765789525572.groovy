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

filterStartDateNegative = new Date().format('ddMMyyyy')

filterEndDateNegative = new Date().minus(1).format('ddMMyyyy')

WebUI.callTestCase(findTestCase('Dika/Login Web/001 Login Web'), [('urlWeb') : urlWeb, ('usernameSpv') : usernameSpv, ('passwordSpv') : passwordSpv], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ApplicationsCatalog/span_Risk Control Unit Application'))

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/span_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/span_Akuisisi'))

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/span_ShowroomSupplier'))

WebUI.comment('scenario 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_KunjunganShowroom/span_Silakan gunakan filter untuk menampilkan data'), 
    'Silakan gunakan filter untuk menampilkan data.')

WebUI.comment('scenario 2')

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/button_Cari'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_KunjunganShowroom/div_Branch Harus Diisi'), 0)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_KunjunganShowroom/div_Branch Harus Diisi'), 'Branch Harus Diisi')

WebUI.comment('scenario 3')

WebUI.setText(findTestObject('Object Repository/Page_KunjunganShowroom/input_Tanggal Registrasi_b3-b1-b1-Input_StartDate'), 
    filterStartDateNegative)

WebUI.setText(findTestObject('Object Repository/Page_KunjunganShowroom/input__b3-b1-b1-Input_StartDate2'), filterEndDateNegative)

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/button_Cari'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_KunjunganShowroom/div_Tanggal mulai tidak boleh lebih besar d_26e6d1'), 
    0)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_KunjunganShowroom/div_Tanggal mulai tidak boleh lebih besar d_26e6d1'), 
    'Tanggal mulai tidak boleh lebih besar dari tanggal akhir')

WebUI.comment('scenario 4')

WebUI.refresh()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_KunjunganShowroom/select_Select BranchBANDUNG ABU 1SURABAYA A_7fdee0'), 
    filterDropdownCabangKunjunganShowroom, true)

if(filterStartDate == "01011900") {
	
}else {
	WebUI.setText(findTestObject('Object Repository/Page_KunjunganShowroom/input_Tanggal Registrasi_b3-b1-b1-Input_StartDate'),
		filterStartDate)
}

if(filterEndDate == "01011900") {

}else {
WebUI.setText(findTestObject('Object Repository/Page_KunjunganShowroom/input__b3-b1-b1-Input_StartDate2'), filterEndDate)
}

WebUI.click(findTestObject('Object Repository/Page_KunjunganShowroom/button_Cari'))

