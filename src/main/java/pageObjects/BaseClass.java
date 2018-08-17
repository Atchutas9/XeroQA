package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public abstract class BaseClass {

	protected WebDriver driver;
	protected Accounts accounts;
	protected AddBankAccount addBankAccount;
	protected BankAccounts bankAccounts;
	protected Dashboard dashboard;
	protected LogInPage logInPage;
	protected TwoStepVerification twoStepVerification;
	
	@BeforeClass
	protected void launch_Browser(String siteURL) throws Exception {
		System.out.println("user dir " +System.getProperty("user.dir") );
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome browser has been lauched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(siteURL);
		System.out.println(siteURL +" Url has opened in the chrome browser");
	}	
	
	protected void enter_text(String strText, WebElement we) {
		we.clear();
		we.sendKeys(strText);
		System.out.println("Entered " +strText+ " on the field " +we.getText());
	}
	
	protected void click_Button(String strBtnName, WebElement we) {
		we.click();
		System.out.println("Clicked on the button " + we.getText());
	}
	
	protected void click_ButtonList(String strBtnName, List<WebElement> listBtn) {
		for(WebElement we: listBtn) {
			if(we.getText().equals(strBtnName)) {
				we.click();
				System.out.println("Selected the value from the list : " +we.getText());
			}
		}
		
	}
	
	protected void select_FromList(String sList, List<WebElement> listWe) {
		for(WebElement we: listWe) {
			if(we.getText().equals(sList)) {
				we.click();
				System.out.println("Selected the value from the list : " +we.getText());
			}
		}
	}

	
	protected String get_Text(WebElement we) {
		return we.getText();
	}

	protected Boolean assert_Page(String actual, String expected) {
		if(actual == expected) {
			return true;
		}
		
		return false;
	}
	
	public void implicitPageLoad(int time) throws Exception {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void explicitWaitOfElement(int time, WebElement ele) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	@AfterClass
	public void quitBrowser() throws Exception {
		driver.quit();
	}
}