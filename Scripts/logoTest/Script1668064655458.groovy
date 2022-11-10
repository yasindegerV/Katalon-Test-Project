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

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'logo yazılım')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Sil_btnK'))

WebUI.click(findTestObject('Object Repository/Page_logo yazlm - Googleda Ara/span_Logo Yazlm - Logo Fiyatlar 2022 nceleyin'))

WebUI.click(findTestObject('Object Repository/Page_Logo Yazlm  Kurumsal  Yazlmlar  444 56 46/span_Bilgi talebi'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logo Yazlm  Kurumsal  Yazlmlar  444 56 46/h3_LOGO Yazlm hakkndaki sorularnz ve talepl_e30c33'), 
    'LOGO Yazılım hakkındaki sorularınız ve talepleriniz için')

WebUI.closeBrowser()

