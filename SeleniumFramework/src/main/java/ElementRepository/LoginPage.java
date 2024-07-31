package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{
	public LoginPage(WebDriver  driver) {
		super(driver);
	}
	@FindBy(id= "Email")
	private WebElement emailTextBox;
	
	@FindBy(id="Password")
	private WebElement passwordTextBox;
	
	@FindBy(id="RememberMe")         // go the source generate getter select encapsulation
	private WebElement rememberMeCheckBox;
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = )
	private WebElement forgotPassLink;
	
}
