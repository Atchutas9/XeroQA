package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddBankAccount extends BaseClass{
	
	@FindBy(how = How.CSS, using = ".co-page-title")
	private WebElement coPgTitle;
	
	@FindBy(how = How.CSS, using = "[type='search']")
	private WebElement srcBankField;
	
	@FindBy(how = How.CSS, using=".ba-banklist--item")
	private List<WebElement> banksList;
	
	@FindBy(how = How.CSS, using = "[data-automationid='accountName']")
	private WebElement txtbx_accntName;
	
	@FindBy(how = How.CSS, using = "[data-automationid='accountType']")
	private List<WebElement> drpdwn_accntType;
	
	@FindBy(how = How.CSS, using = "[data-automationid='accountType'] .x-form-error-wrap-default" )
	private WebElement err_AccntType;
	
	@FindBy(how = How.CSS, using = "[data-automationid='bsbCode']")
	private WebElement txtbx_Bsb;
	
	@FindBy(how = How.CSS, using = "[data-automationid='accountNumber']")
	private WebElement txtbx_AccntNumber;
	
	@FindBy(how = How.CSS, using = ".co-btn")
	private List<WebElement> btn_CommonBtn;
	
	

	public String getTitle_CoPg() {
		return coPgTitle.getText();
	}
	
	public void enter_AccountName(String accntName) {
		enter_text(accntName, txtbx_accntName);
	}
	
	//public void 
	public void enter_BankNameFromList(String myBank)  {
		select_FromList(myBank, banksList);
	}
	
	public void enter_BSBCode(String bsbcode) {
		enter_text(bsbcode, txtbx_Bsb);
		
	}
	
	public void enter_AccountNumber(String accntNum) {
		enter_text(accntNum, txtbx_AccntNumber);
		
	}
	
	public void click_OnButton(String btn) {
		click_ButtonList(btn, btn_CommonBtn);
	}
}
	
