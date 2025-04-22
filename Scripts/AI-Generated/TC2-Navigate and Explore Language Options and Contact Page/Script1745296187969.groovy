import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button languageSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_languageSelect'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button languageSelect.png')

"Step 3: Click on link languageOptions (langDe)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageOptions', ['link_languageOptions_dataTest': link_languageOptions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link languageOptions langDe.png')

"Step 4: Click on button languageSelect2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_languageSelect2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button languageSelect2.png')

"Step 5: Click on link languageOptions (langEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageOptions', ['link_languageOptions_dataTest': link_languageOptions_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link languageOptions langEn.png')

"Step 6: Click on button languageSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_languageSelect'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button languageSelect.png')

"Step 7: Click on link languageOptions (langEs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageOptions', ['link_languageOptions_dataTest': link_languageOptions_dataTest_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link languageOptions langEs.png')

"Step 8: Click on button languageSelect3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_languageSelect3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button languageSelect3.png')

"Step 9: Click on link languageOptions (langEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageOptions', ['link_languageOptions_dataTest': link_languageOptions_dataTest_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link languageOptions langEn.png')

"Step 10: Click on link contact -> Navigate to page 'contact#contact'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_contact'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link contact - Navigate to page contactcontact.png')

"Step 11: Click on link signIn -> Navigate to page 'login auth#auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link signIn - Navigate to page login authauthlogin.png')

"Step 12: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_login_auth/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link home - Navigate to page .png')

"Step 13: Click on link dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_dynamicObject', ['link_dynamicObject_internalLabel': link_dynamicObject_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on link dynamicObject object.png')

"Step 14: Click on link productTools (productChiselsSet) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productTools', ['link_productTools_dataTest': link_productTools_dataTest, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link productTools productChiselsSet - Navigate to page productproduct.png')

"Step 15: Click on link productList (productWoodCarvingChisels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText, 'product_id': product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link productList productWoodCarvingChisels.png')

"Step 16: Click on link productList (productSwissWoodcarvingChisels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_1, 'product_id': product_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link productList productSwissWoodcarvingChisels.png')

"Step 17: Click on link categories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on link categories.png')

"Step 18: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link home - Navigate to page .png')

"Step 19: Click on link dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_dynamicObject', ['link_dynamicObject_internalLabel': link_dynamicObject_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on link dynamicObject object2.png')

"Step 20: Click on link productTools (productEarProtection) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productTools', ['link_productTools_dataTest': link_productTools_dataTest_1, 'product_id': product_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link productTools productEarProtection - Navigate to page productproduct.png')

"Step 21: Click on link productList (productSafetyGoggles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_2, 'product_id': product_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on link productList productSafetyGoggles.png')

"Step 22: Click on link productList (productProtectiveGloves)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_3, 'product_id': product_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link productList productProtectiveGloves.png')

"Step 23: Click on link productList (productSuperThinProtectionGloves)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_4, 'product_id': product_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on link productList productSuperThinProtectionGloves.png')

"Step 24: Click on link productList (productConstructionHelmet)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_5, 'product_id': product_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on link productList productConstructionHelmet.png')

"Step 25: Click on link productList (productEarProtection) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_6, 'product_id': product_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on link productList productEarProtection - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate and Explore Language Options and Contact Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}