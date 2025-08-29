package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class LoginPageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I entered Enter your email in login page as '(.*)'$")			
            public void whenIEnteredEnterYourEmailInLoginPageAsenterYourEmail(String  varenterYourEmail)
            {
                workFlow.enterText(varenterYourEmail, 0, "Login Page", "Login Page.EnteryouremailTextBoxXPATH", "XPATH");
                
            }
            @When("^I entered Enter your password in login page as '(.*)'$")			
            public void whenIEnteredEnterYourPasswordInLoginPageAsenterYourPassword(String  varenterYourPassword)
            {
                workFlow.enterText(varenterYourPassword, 0, "Login Page", "Login Page.EnteryourpasswordTextBoxXPATH", "XPATH");
                
            }
            @When("^I copied text Enter your password in login page$")			
            public void whenICopiedTextEnterYourPasswordInLoginPage()
            {
                workFlow.copiedtext(0, "Login Page", "Login Page.EnteryourpasswordTextBoxXPATH", "XPATH");
                
            }
             @Then("^verify content Enter your password in login page as '(.*)'$")			
            public void thenVerifyContentEnterYourPasswordInLoginPageAsenterYourPassword1(String  varenterYourPassword1)
            {
                Assertion.isTrue(workFlow.verifyContentTextBox(varenterYourPassword1, 0, "Login Page", "Login Page.EnteryourpasswordTextBoxXPATH", "XPATH"), "Then verify content Enter your password in login page as '<Enter your password1>'");
      WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I selected Login Button in login page$")			
            public void whenISelectedLoginButtonInLoginPage()
            {
                workFlow.clickedElement(0, "Login Page", "Login Page.LoginButtonButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed Login to algoQA in login page$")			
            public void thenVerifyDisplayedLoginToAlgoqaInLoginPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Login Page", "Login Page.LogintoalgoQALabelXPATH", "XPATH"), "Then verify displayed Login to algoQA in login page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed User signed in successfully popup in login page$")			
            public void thenVerifyDisplayedUserSignedInSuccessfullyPopupInLoginPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Login Page", "Login Page.UsersignedinsuccessfullypopupLabelXPATH", "XPATH"), "Then verify displayed User signed in successfully popup in login page");
        WebBrowserUtil.captureScreenshot();
                
            }
    }