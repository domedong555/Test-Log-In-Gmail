import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#')

WebUI.setText(findTestObject('Object Repository/Gmail/Page_Gmail/input_ Gmail_identifier'), 'justforsharenetflix@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Gmail/Page_Gmail/input_ Gmail_identifier'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Gmail/Page_Gmail/input__password'), 'HqtyhOU/eSAeT4aNrEk7gw==')

WebUI.sendKeys(findTestObject('Object Repository/Gmail/Page_Gmail/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Gmail/Page_ - justforsharenetflixgmailcom - Gmail/div_'))

WebUI.setText(findTestObject('Object Repository/Gmail/Page_ - justforsharenetflixgmailcom - Gmail/textarea__to'), 'pagorn56110@gmail.com')

WebUI.setText(findTestObject('Object Repository/Gmail/Page_ - justforsharenetflixgmailcom - Gmail/input_pagorn56110gmailcom_subjectbox'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Gmail/Page_ - justforsharenetflixgmailcom - Gmail/div_Testing'), 'Testing')

WebUI.click(findTestObject('Object Repository/Gmail/Page_ - justforsharenetflixgmailcom - Gmail/div__1'))

WebUI.closeBrowser()

