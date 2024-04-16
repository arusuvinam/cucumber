package org.step;
import org.ggg.*;
import org.lll.PojoC;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnition extends BaseClass {
	@Given("User have to open the browser")
	public void user_have_to_open_the_browser() {
		openChrome();
		openWebpage("https://www.facebook.com/");
		
	}

	@When("to pass valid email and invalid pass")
	public void to_pass_valid_email_and_invalid_pass() {
		PojoC l=new PojoC();
		sending(l.getEmail(), "arusuvinam");
		sending(l.getPass(), "123");
		clicking(l.getLogin());
		
		
	  
	}

	@Then("to close the browser")
	public void to_close_the_browser() {
		closeBrowser();
	    
	}

	@Given("To maximie the window and waiting for browser loading")
	public void to_maximie_the_window_and_waiting_for_browser_loading() {
	    
		maxWindow();
		impWait();
	}

	@When("to check user in home page or invalide creditial page")
	public void to_check_user_in_home_page_or_invalide_creditial_page() {
	     String Url = pageUrl();
	     
	     if (Url.contains("privacy_mutation_token"))
	    		 {
	    	 System.out.println("user in invalide credential page");}
	    	 else {
	    		 System.out.println("user in home page");
				
			}
			
		
		
	}
	@When("to get page title and url")
	public void to_get_page_title_and_url() {
	   System.out.println( pageTitle());
	  System.out.println( pageUrl());
	}
	
	

	@When("take screenshot")
	public void take_screenshot() {
	    
	}
	@When("to pass valid email and click the login button")
	public void to_pass_valid_email_and_click_the_login_button() {
		PojoC l=new PojoC();
		sending(l.getEmail(), "vijayansuvinam");
		clicking(l.getLogin());
	}
	@When("to click forgotten password")
	public void to_click_forgotten_password() {
	}

	@When("to pass invalid phone number and click search button")
	public void to_pass_invalid_phone_number_and_click_search_button() {
	    
	}

	@When("to check getting otp or not")
	public void to_check_getting_otp_or_not() {
	    
	}
	
	@When("to pass{string}  and {string}")
	public void to_pass_and(String username, String pass) {
		PojoC l=new PojoC();
		sending(l.getEmail(), "username");
		sending(l.getPass(), "pass");
		clicking(l.getLogin());
		
		
	}
	@When("to pass invalid email and valid pass")
	public void to_pass_invalid_email_and_valid_pass() {
		PojoC l=new PojoC();
		sending(l.getEmail(), "vijayan");
		sending(l.getPass(), "1237uu");
		clicking(l.getLogin());
	    
	}








}





