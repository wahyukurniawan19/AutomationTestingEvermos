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

WebUI.navigateToUrl('https://evermos.com/home/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Evermos/Page_Evermos Reseller online dan aplikasi D_3b84c7/Menu_Masuk'))

WebUI.click(findTestObject('Object Repository/Evermos/Page_Masuk Sebagai Reseller Evermos/button_Masuk'))

WebUI.verifyElementText(findTestObject('Evermos/Page_Masuk Sebagai Reseller Evermos/verify_Nomor telepon harus di isi'), 
    'Nomor telepon harus di isi')

WebUI.verifyElementText(findTestObject('Evermos/Page_Masuk Sebagai Reseller Evermos/Verify_Kata sandi harus di isi'), 'Kata sandi harus di isi')

WebUI.closeBrowser()

