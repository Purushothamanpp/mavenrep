package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productspage {

	

	WebDriver driver;
	public productspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
    private WebElement linkimg;
	public WebElement getLinkimg() {
		return linkimg;
	}






}