package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage extends BaseClass {
	
	@FindBy(how = How.ID, using = "email")
	private WebElement txtbx_Email;
	
	@FindBy(how = How.ID, using ="password")
	private WebElement txtbx_Password;
	
	@FindBy(how = How.ID, using = "submitButton")
	private WebElement btn_Submit;
	
	
	public void enter_DetailsToLogin(String em, String pw) {
		enter_text(em, txtbx_Email);
		enter_text(pw, txtbx_Password);
		
	}
	
	public void click_OnLoginBtn(String sb) {
		click_Button(sb, btn_Submit);
	}
	
	
}
