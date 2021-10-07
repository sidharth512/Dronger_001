package login.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	@FindBy(id="txtUsername")
	private WebElement logintextfield;
	@FindBy(id="txtPassword")
	private WebElement passwordtextfield;
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
	
	public login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginuser(String user) {
		logintextfield.sendKeys(user);
	}
	public void loginpassword(String pwd) {
		passwordtextfield.sendKeys(pwd);
		
		
	}
	public void loginbutton() {
		loginbutton.click();	
	}

}
