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



WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/svg'))

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_Name_firstName'), 'Tester')

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_Name_lastName'), 'Testing')

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_Email_userEmail'), 'testing@gmail.com')

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_(10 Digits)_userNumber'), '1234567890')

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_Subjects_subjectsInput'), 'maths')

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/input_Subjects_subjectsInput'), 'maths')

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/label_Sports'))

WebUI.setText(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    '123 main strasse')

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/ThirdTestobjects/Page_DEMOQA/button_Close'))



