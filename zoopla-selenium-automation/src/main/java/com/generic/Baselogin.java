package com.generic;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.util.BaseConfig;
import com.util.Highlighter;

public class Baselogin {
	public PF masterlogin( WebDriver driver) {
		PF obj = new PF(driver);
		
		obj.getAcceptallcookies().click();
		
		Highlighter.addColor(driver,obj.getEmail());
		
		obj.getEmail().sendKeys(BaseConfig.getConfig("user"));
		Highlighter.addColor(driver,obj.getPassword());
		
		obj.getPassword().sendKeys(BaseConfig.getConfig("pass"));
		obj.getSigninbutton2().click();
		
return obj;
}
	
}