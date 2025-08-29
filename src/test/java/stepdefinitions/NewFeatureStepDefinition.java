package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NewFeatureStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected profile menu 3dots in left navigation bar$")			
            public void whenISelectedProfileMenu3dotsInLeftNavigationBar()
            {
                workFlow.clickedElement(0, "New Feature", "New Feature.profilemenu3dotsButtonXPATH", "XPATH");
                
            }
    }