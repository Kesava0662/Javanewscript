package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class AlgoshackStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected Logout in profile menu$")			
            public void whenISelectedLogoutInProfileMenu()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.LogoutButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed Show Password Eye button in login page$")			
            public void thenVerifyDisplayedShowPasswordEyeButtonInLoginPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.ShowPasswordEyebuttonLabelXPATH", "XPATH"), "Then verify displayed Show Password Eye button in login page");
        WebBrowserUtil.captureScreenshot();
                
            }
    }