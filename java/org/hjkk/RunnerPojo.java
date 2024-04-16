package org.hjkk;

import java.io.IOException;

import org.ggg.BaseClass;
import org.lll.PojoC;
import org.openqa.selenium.WebElement;

public class RunnerPojo extends BaseClass {
	public static void main(String[] args) throws IOException {
		
	openChrome();
	maxWindow();
	openWebpage("http://www.facebook.com/");
	 
	PojoC l=new PojoC();
	
WebElement email = l.getEmail();
	//sending(email, "arusuvinam");
	

	//sending(l.getPass()," 1234400");
	
	//clicking(l.getLogin());
	
	//driver.navigate().refresh();
	
	//sending(email, "vijayansuvinam");
	//sending(l.getPass(), "8976");

String mail = getExel("aru", "sheet2", 2, 0);
sending(email, mail);
sending(l.getPass(), getExel("aru", "sheet2", 1, 0));
	}}
