package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddUser {
	WebDriver driver;
	@Given("^user navigate to orangehrm$")
	public void user_navigate_to_orangehrm() throws Throwable {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://orangehrm.qedgetech.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^user logs in using username \"([^\"]*)\" and password as\"([^\"]*)\"$")
	public void user_logs_in_using_username_and_password_as(String username, String password) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	    driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@When("^user click admin$")
	public void user_click_admin() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	}

	@When("^user click add$")
	public void user_click_add() throws Throwable {
		driver.findElement(By.name("btnAdd")).click();
	}

	@When("^user select role\"([^\"]*)\"$")
	public void user_select_role(String userrole) throws Throwable {
	    new Select(driver.findElement(By.name("systemUser[userType]"))).selectByVisibleText(userrole);
	  
	}

	@When("^user enter ename \"([^\"]*)\"$")
	public void user_enter_ename(String ename) throws Throwable {
	    driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(ename);
	}

	@When("^user enter username\"([^\"]*)\"$")
	public void user_enter_username(String user) throws Throwable {
		driver.findElement(By.name("systemUser[userName]")).sendKeys(user);
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String pass) throws Throwable {
		driver.findElement(By.name("systemUser[password]")).sendKeys(pass);
		Thread.sleep(2000);
	}

	@When("^user enter cpassword\"([^\"]*)\"$")
	public void user_enter_cpassword(String cpass) throws Throwable {
		driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(cpass);
	}

	@When("^user clicks on save$")
	public void user_clicks_on_save() throws Throwable {
	    driver.findElement(By.name("btnSave")).click();
	}

	@Then("^user validate Url$")
	public void user_validate_Url() throws Throwable {
	    String expected = "viewSystemUsers";
	    String actual = driver.getCurrentUrl();
	    if(actual.contains(expected))
	    {
	    	System.out.println("Add user success");
	    }else
	    {
	    	System.out.println("Add user fail");
	    }
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    driver.close();
	}

}
