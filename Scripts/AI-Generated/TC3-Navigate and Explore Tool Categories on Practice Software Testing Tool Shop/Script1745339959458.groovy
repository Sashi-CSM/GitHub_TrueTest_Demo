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

"Step 2: Click on label mightyCraftHardware"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_mightyCraftHardware'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on label mightyCraftHardware.png')

"Step 3: Click on link toolCategories (drawerToolCabinet) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productTools', ['link_productTools_dataTest': link_productTools_dataTest, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link toolCategories drawerToolCabinet - Navigate to page productproduct.png')

"Step 4: Click on button cartFavorites (addToFavorites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_cartFavorites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_cartFavorites', ['button_cartFavorites_dataTest': button_cartFavorites_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button cartFavorites addToFavorites.png')

"Step 5: Click on link productList (toolCabinetMoreInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText, 'product_id': product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link productList toolCabinetMoreInfo.png')

"Step 6: Click on header productName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/header_productName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on header productName.png')

"Step 7: Click on link categories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link categories.png')

"Step 8: Click on link rentals -> Navigate to page 'rental listings#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_rentals'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on link rentals - Navigate to page rental listings.png')

"Step 9: Click on image thorHammer -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_rental_listings/image_thorHammer'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on image thorHammer - Navigate to page productproduct.png')

"Step 10: Click on link productList (productSledgehammer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_productList"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_productList', ['link_productList_internalHasText': link_productList_internalHasText_1, 'product_id': product_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link productList productSledgehammer.png')

"Step 11: Click on header productName -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/header_productName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on header productName - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Explore Tool Categories on Practice Software Testing Tool Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}