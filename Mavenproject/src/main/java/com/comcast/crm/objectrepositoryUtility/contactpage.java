package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {


	WebDriver driver;

	public contactpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement contactlink;

	public WebElement getContactlink() {
		return contactlink;
	}
	
	
	
	
}
