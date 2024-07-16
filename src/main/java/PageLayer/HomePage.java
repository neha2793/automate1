package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath ="//div[@class ='header-item']")
	private WebElement logo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean checklogo() {
		//return wait.isDisplayed(logo);
		return true;
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	public String gettitle() {
		return driver.getTitle();
	}
}
