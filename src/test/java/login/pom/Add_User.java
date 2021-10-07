package login.pom;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_User {
	public WebDriver driver;
 @FindBy(id="UserHeading")
 private WebElement userheader;
 @FindBy(id="systemUser_userType")
 private WebElement User_Role;
 @FindBy(id="systemUser_employeeName_empName")
 private WebElement Employee;
 @FindBy(xpath="//strong[.='Ananya']")
 private WebElement Ananya;
 @FindBy(id="systemUser_userName")
 private WebElement username;
 @FindBy(id="systemUser_status")
 private WebElement userstatus;
 @FindBy(id="systemUser_password")
 private WebElement User_pwd;
 @FindBy(id="systemUser_confirmPassword")
 private WebElement confirmpwd;
 @FindBy(id="btnSave")
 private WebElement savebutton;
 
 public Add_User(WebDriver driver){
	 PageFactory.initElements(driver, this);
	 this.driver=driver;
 }
 public void header() {
	String userhead= userheader.getText();
	System.out.println(userhead);
	Assert.assertEquals(userhead, "Add User");
 }
 public void RoleofUser() {
	 Select sel=new Select(User_Role);
	 sel.selectByVisibleText("ESS");
	 String Role=User_Role.getAttribute("value");
	 
	 Assert.assertEquals(Role, "2");
	 
	
 }
 public void Empname(String emp) throws InterruptedException {
	 Employee.sendKeys(emp);
	 Thread.sleep(3000);
	 Actions act=new Actions(driver);
	 act.moveToElement(Ananya).click().perform();
	 
 }
 public void username(String user) {
	 username.sendKeys(user); 
 }
 public void status() {
	Select sel =new Select(userstatus);
	sel.selectByVisibleText("Enabled");
	System.out.println(userstatus.getText());

 }
 public void password(String pwd) {
	 User_pwd.sendKeys(pwd);
	 
 }
 public void confirmpassword(String confirm) {
	 confirmpwd.sendKeys(confirm);
 }
 public void savebutton() throws InterruptedException {
	// JavascriptExecutor jc=(JavascriptExecutor)driver;
	 //jc.executeScript("arguments[0].click", savebutton);
	 Thread.sleep(3000);
	 savebutton.click();
	
 }
 
}
