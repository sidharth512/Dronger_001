package login.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Admin_page_POM {
	public WebDriver driver;
 @FindBy(xpath="//b[.='Admin']")
 private WebElement Adminbutton;
 @FindBy(name="btnAdd")
 private WebElement Addbutton;
 @FindBy (xpath="//a[@class=\"toggle tiptip\"]")
 private WebElement username;
 @FindBy (xpath="//td[@class=\"left\"]")
 private List<WebElement>  Name;
 
  public Admin_page_POM(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
	  public void Addbutton() {
		  Addbutton.click(); 
	  }
	  public void Adminbutton() {
		  Adminbutton.click();
		  
	  }
	  public void VerifyAdminpage() {
		 String text=username.getText();
		 System.out.println(text);
		 Assert.assertEquals(text, text);
	  }
	  public void Verifyuser() throws InterruptedException {
		 if( driver.getPageSource().contains("Sussesfully")) {
			 System.out.println("usercreated");
		 }
		/*  Thread.sleep(3000);
		  int size=Name.size();
		  System.out.println(size);
		  for(int i=0;i<=size;i++) {
			  if(Name.get(i).getText().contains("Amitai"));
			  System.out.println("user created");
			  */
		  }
	  }

