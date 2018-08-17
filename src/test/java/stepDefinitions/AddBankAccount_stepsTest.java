package stepDefinitions;

import cucumber.api.java.en.Given;
import pageObjects.BaseClass;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class AddBankAccount_stepsTest extends BaseClass{
	

public AddBankAccount_stepsTest(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	@Given("^I want to launch into the \"([^\"]*)\" in the browser$")
	public void i_want_to_launch_into_the_xero_url_in_the_browser(String sUrl) throws Throwable {
		launch_Browser(sUrl);

	}

	//Then I enter the <username> and  <password> on the login screen
	@Then("^I enter the \"([^\"]*)\"  and \"([^\"]*)\" on the login screen$")
	public void i_enter_the_email_password_on_the_login_screen(String sEmail, String sPassword) throws Throwable {
		
		logInPage.enter_DetailsToLogin(sEmail, sPassword);
		
	}

	
	@Then("^I click on \"([^\"]*)\" button to login$")
	public void i_click_on_submit_button_to_login(String sLoginBtn) throws Throwable {
		logInPage.click_OnLoginBtn(sLoginBtn);
				
	}

	@Then("^I click on \"([^\"]*)\" on the verfication page$")
	public void i_click_on_NotNow_link_on_the_verfication_page(String sLink) throws Throwable {
		twoStepVerification.perform_NotNowAction(sLink);
		
	}

	@Then("^I should land on the \"([^\"]*)\" page$")
	public void i_should_land_on_the_xero_dashboard_page(String sDashboard) throws Throwable {
		dashboard.assert_DashboardPg(sDashboard);
		
	}
	
  
  // I click on <tab> and <subMenu> from the menu header
  @Then("^I click on  \"([^\"]*)\" and \"([^\"]*)\" from the main menu$")
  public void i_click_on_tab_subMenu_from_the_main_header(String sTab, String sSubMenu) throws Throwable {
	  accounts.clickOn_BlueHdr(sTab);
	  accounts.clickOn_SubMenuHdr(sSubMenu);
	  	  
  }
  //And I click on "Add Bank Account" on Accounts page
  @And("^I click on \"([^\"]*)\" on Accounts page$")
  public void i_click_on_add_bank_account_on_accounts_page(String sAddBankAccnt) throws Throwable {
	  bankAccounts.clickOn_AddBankAccount(sAddBankAccnt);
	  	  
  }
  
  //Then I select the <bankName> from the bank list
  @Then("^I select the \"([^\"]*)\" from the bank list$")
  public void i_select_the_bankName_from_the_bank_list(String sBankName) throws Throwable{
	  addBankAccount.enter_BankNameFromList(sBankName);
	  
  }
  
  //Then I enter the <accountName> and select the <accountType>
  @Then("^I enter the \"([^\"]*)\" and select the \"([^\"]*)\"$")
  public void i_enter_the_accountName_and_select_the_accountType(String sAccountName, String sAccountType) throws Throwable {
	  addBankAccount.enter_AccountName(sAccountName);
	  addBankAccount.enter_BankNameFromList(sAccountType);  
	  
  }
  
  //And I enter <bsbCode> and <accountNumber>
  @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
  public void i_enter_bsbCode_and_accountNumber(String sBsbCode, String sAccountNumber) throws Throwable {
	  addBankAccount.enter_BSBCode(sBsbCode);
	  addBankAccount.enter_AccountNumber(sAccountNumber);
  }
  
  //Then I click on <button> to proceed further
  @Then("^I click on \"([^\"]*)\" to proceed further$")
  public void i_click_on_button_to_proceed_further(String sButton) throws Throwable {
	  addBankAccount.click_OnButton(sButton);
	  
  }
  
  //Then I see the account has been added successfully on bank accounts tab
  @Then("^I see the account has been added successsfully on bank accounts tab$")
  public void i_see_the_account_has_been_added_successsfully_on_bank_accounts_tab() throws Throwable {
	  bankAccounts.get_AccountAddedMsg();
  }

  

}
