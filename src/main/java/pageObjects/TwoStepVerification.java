package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwoStepVerification extends BaseClass {

	
	@FindBy(how = How.CSS, using = "button.xui-button[data-automationid='auth-notnowbutton']")
	private WebElement lnk_NotNow;
	
	@FindBy(how = How.CSS, using = "h1.xui-heading")
	private WebElement heading_TwoStepVerify;
	
	
	
	public void perform_NotNowAction(String sLink) {
		String expect_TwoStepHeading = "Set up two-step authentication";
		
		String actual_TwoSstepHeading = heading_TwoStepVerify.getText();
		
		if(expect_TwoStepHeading == actual_TwoSstepHeading) {
			click_Button(sLink, lnk_NotNow);
		}
		
	}
}
