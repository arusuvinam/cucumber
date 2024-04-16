package org.step;

import org.ggg.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	
	@Before
	public void bef() {
		
openChrome();
openWebpage("https://www.facebook.com/");
maxWindow();
	}
	
	@After
	public void aft() {

	closeBrowser();

	}

}
