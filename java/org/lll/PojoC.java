package org.lll;

import org.ggg.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoC extends BaseClass {
	public PojoC() {
		PageFactory.initElements(driver, this);
	}
	
@CacheLookup
@FindBy(name = "email")
WebElement email;
@CacheLookup
@FindBy(xpath = "//input[@id='pass']")
WebElement pass;

@CacheLookup
@FindBy(xpath = "//button[text()='Log in']")
WebElement login;

public WebElement getEmail() {
	return email;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}

//@FindBys ({
	
	//@FindBy(xpath ="//button[text()='Log in'] "),
	//@FindBy(name ="login" )
	

	
//}
//)

	
}
