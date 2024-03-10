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

WebUI.navigateToUrl(GlobalVariable.urlBTNPropertiCalculate)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('CalculatePropertyPrice/input_penghasilanTotal'), penghasilan_total)

WebUI.setText(findTestObject('CalculatePropertyPrice/input_Per Bulan_floating-label-field'), pengeluaran)

WebUI.selectOptionByIndex(findTestObject('CalculatePropertyPrice/select_jangkaWaktu'), jangka_waktu)

WebUI.click(findTestObject('CalculatePropertyPrice/button_Hitung'))

WebUI.verifyElementPresent(findTestObject('CalculatePropertyPrice/h5_Harga Properti Maksimal Kamu'), 0)

WebUI.verifyElementVisible(findTestObject('CalculatePropertyPrice/h3_hasilClculate'))

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('CalculatePropertyPrice/select_jangkaWaktu'), jangka_waktu_2)

WebUI.click(findTestObject('CalculatePropertyPrice/button_Hitung Ulang'))

WebUI.verifyElementPresent(findTestObject('CalculatePropertyPrice/h5_Harga Properti Maksimal Kamu'), 0)

WebUI.verifyElementVisible(findTestObject('CalculatePropertyPrice/h3_hasilClculate'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

