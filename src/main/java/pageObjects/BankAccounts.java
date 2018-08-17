package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAccounts extends BaseClass{
	
	@FindBy(how = How.ID, using = "title")
	private WebElement titleSubMenu;
	
	@FindBy(how = How.CSS, using ="[data-automationid='Add Bank Account-button']")
	private WebElement addBankAcc;
	
	@FindBy(how = How.CSS, using = ".bank-accounts .message p")
	private WebElement txt_AccAddedMsg;
	
	public String getTitle_SubMenu(WebElement we) {
		return we.getText();
	}
	
	public void clickOn_AddBankAccount(String sAddbnk) {
		click_Button(sAddbnk, addBankAcc);
		
	}
	
	
	public void get_AccountAddedMsg() {
		
		getTitle_SubMenu(txt_AccAddedMsg);
		System.out.println("Text present is : " +txt_AccAddedMsg.getText());
	}
}
