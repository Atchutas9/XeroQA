package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard extends BaseClass{
	
	
	
	@FindBy(how = How.CSS, using =".xn-h-menu.selected a[data-type='menu-focus']")
	private WebElement tab_Dashboard;
	
	@FindBy(how = How.CSS, using=".xdash-setupitem__setup--widget-card-heading___1mEEz")
	private WebElement txt_DashBoardTitle;
	
		
	
	public void on_DashboardPage() {
		get_Text(txt_DashBoardTitle);
			
	}
	
	public void assert_DashboardPg(String sActual) {
		String sExpected = txt_DashBoardTitle.getText();
		assert_Page(sActual, sExpected);
	}

}
