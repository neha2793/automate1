package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {

	
	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath = "//a[@href = '/contacts/new']")
	private WebElement createbtn;
	
	@FindBy(name ="first_name")
	private WebElement firstname;
	
	
	@FindBy(name ="last_name")
	private WebElement lastname;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
}
