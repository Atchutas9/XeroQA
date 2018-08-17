package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Accounts extends BaseClass {
	
	@FindBy(how = How.CSS, using ="a[data-js='open-menu'][data-type='menu-focus']")
	private List<WebElement> menu_BlueHdr;
	
	@FindBy(how = How.CSS, using ="[data-js='open-widget'] .xn-h-menu-list[data-js='widget'] [data-type='menu-focus']")
	private List<WebElement> subMenu_BlueHdr;
	
	
	public void clickOn_BlueHdr(String strHdr) {
		select_FromList(strHdr, menu_BlueHdr);
				
	}
	
	public void clickOn_SubMenuHdr(String subMenu) {
		select_FromList(subMenu, subMenu_BlueHdr);
	}
	
	
}
