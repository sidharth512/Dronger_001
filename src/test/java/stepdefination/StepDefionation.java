package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import login.pom.Add_User;
import login.pom.Admin_page_POM;
import login.pom.login_page;


public class StepDefionation {
	public WebDriver driver;
	public login_page link;
	
	@Given("User open the chrome browser")
	public void user_open_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User 1\\Desktop\\ecplics\\Dronger\\driver\\chromedriver.exe" );
		driver=new ChromeDriver();
	    
	}

	@When("Enter the url {string}")
	public void enter_the_url(String url) {
		driver.get(url);
	   
	}

	@Then("uaser should be at login page")
	public void uaser_should_be_at_login_page() {
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	   System.out.println("At login page");
	}

	@When("user enter the username as {string} and password as {string}")
		public void user_enter_the_username_as_and_password_as(String user, String pwd) {
	
      link=new  login_page(driver);
      link.loginuser(user);
      link.loginpassword(pwd);
	   
	}

    @When("click on lofgin button")
	public void click_on_lofgin_button() {
    	 link=new  login_page(driver);
        link.loginbutton();	  
	}

	@Then("user should be at home page.")
	public void user_should_be_at_home_page() {
	  String  Homepage=driver.getTitle();
	  Assert.assertEquals("OrangeHRM", Homepage);
	  System.out.println("At home page");
	}

	@When("user click on admin module")
	public void user_click_on_admin_module() {
		Admin_page_POM admin=new Admin_page_POM(driver);
		admin.Adminbutton();
		
		
	  	}

	@Then("admin should display")
	public void admin_should_display() {
		Admin_page_POM admin=new Admin_page_POM(driver);
		admin.VerifyAdminpage();
	   
	}

	@When("user click on ADD button")
	public void user_click_on_add_button() {
		Admin_page_POM admin=new Admin_page_POM(driver);
		admin.Addbutton();
		
	   	}

	@Then("the Add usger page should display")
	public void the_add_usger_page_should_display() {
		Add_User user=new Add_User(driver);
		user.header();
	    
	}

	@Then("select the userrole as ESS")
	public void select_the_userrole_as_ess() {
		Add_User user=new Add_User(driver);
       user.RoleofUser();
	}

	@Then("Enter the into the Employee Name as {string}")
	public void enter_the_into_the_employee_name_as(String emp) throws InterruptedException {
		Add_User user=new Add_User(driver);
		user.Empname(emp);
	}


	@Then("Enter the data in the Username as {string}")
	public void enter_the_data_in_the_username_as(String user) {
		Add_User user1=new Add_User(driver);
		user1.username(user);
		
	}

	@Then("select the status as Enable")
	public void select_the_status_as_enable() {
		Add_User user1=new Add_User(driver);
		user1.status();
	}

	@Then("creat a password as {string}")
	public void creat_a_password_as(String pwd) {
		Add_User user1=new Add_User(driver);
		user1.password(pwd);
	  	}

	@Then("conform the password in conformpassword field {string}")
	public void conform_the_password_in_conformpassword_field(String confirm) {
		Add_User user1=new Add_User(driver);
		user1.confirmpassword(confirm);
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		Add_User user1=new Add_User(driver);
		user1.savebutton();
	}

	@Then("userlist page should display with usernaem as Amit")
	public void userlist_page_should_display_with_usernaem_as_amit() throws InterruptedException {
		Admin_page_POM user=new Admin_page_POM(driver);
		user.Verifyuser();
	}

	

}
