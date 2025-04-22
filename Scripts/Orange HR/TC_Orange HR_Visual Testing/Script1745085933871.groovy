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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h5_Login'), 'Login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.takeScreenshotAsCheckpoint('Screen Shot 1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Admin'), 'Admin\nUser Management')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.takeScreenshotAsCheckpoint('Screen Shot 2', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_PIM'), 'PIM')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Leave'))

WebUI.rightClick(findTestObject('Object Repository/Page_OrangeHRM/h6_Leave'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Leave'), 'Leave')

WebUI.takeScreenshotAsCheckpoint('Screen Shot 3', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Time'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Time'), 'Time\nTimesheets')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Recruitment'))

WebUI.rightClick(findTestObject('Object Repository/Page_OrangeHRM/h6_Recruitment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Recruitment'), 'Recruitment')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_My Info'))

WebUI.takeScreenshotAsCheckpoint('Screen Shot 4', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_PIM'), 'PIM')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Performance'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Performance'), 'Performance\nManage Reviews')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Dashboard'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Dashboard'), 'Dashboard')

WebUI.takeScreenshotAsCheckpoint('Screen Shot 5', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

