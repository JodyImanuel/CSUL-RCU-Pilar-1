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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://galaxydev.outsystemsenterprise.com/Venus/Login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'), 'DedikSudarwanto')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal'), 'jtpiLKQwE8E=')

WebUI.doubleClick(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Home/div_SMD'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Home/span_Production Order'))

int autoGenerateNumber = Integer.parseInt(WebUI.getText(findTestObject('Object Repository/Page_Production Order/span_849'))) + 
1

Date today = new Date()

List<List> listOfLists = new ArrayList()

List<List> header = new ArrayList()

header.add('Order')

header.add('Production Version')

header.add('Sequence number')

header.add('Basic start date')

header.add('Basic start time')

header.add('Basic finish date')

header.add('Basic finish time')

header.add('Material Number')

header.add('Material description')

header.add('Order quantity (GMEIN)')

header.add('Confirmed quantity (GMEIN)')

header.add('Quantity Delivered (GMEIN)')

header.add('Unit of measure (=GMEIN)')

header.add('Confirmation unit (=CONF_UNIT)')

header.add('Long txt exists')

header.add('System Status')

header.add('Batch')

header.add('MRP controller')

listOfLists.add(header)

List<List> row1 = new ArrayList()

row1.add(autoGenerateNumber)

row1.add('SD04')

row1.add(0)

row1.add(new Date())

row1.add('03:00:00 PM')

row1.add(new Date())

row1.add('04:00:00 PM')

row1.add('10000001')

row1.add('test FG tdk valid')

row1.add(6643.200)

row1.add(0.000)

row1.add(0.000)

row1.add('TH')

row1.add('')

row1.add('')

row1.add('REL  ERTR MACM PCC')

row1.add('')

row1.add('F23')

listOfLists.add(row1)

CustomKeywords.'myPack.WriteExcelSmdHeader.demoKey'(listOfLists)

WebUI.doubleClick(findTestObject('Page_Production Order/span_Import'))

WebUI.uploadFile(findTestObject('Page_Production Order/div_Header'), 'D:\\Download\\Media\\Kampus\\OneDrive\\Gawe\\PPU\\10 Venus BAT\\Import Excel\\SMD\\1 SMD Header.XLSX')

