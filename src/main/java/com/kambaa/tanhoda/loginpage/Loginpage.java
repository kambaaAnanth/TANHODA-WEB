package com.kambaa.tanhoda.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kambaa.tanhoda.TestBase.TestBase;

public class Loginpage extends TestBase{
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	public static WebElement Loginbutton;
	@FindBy(xpath="//input[@placeholder='Mobile Number*']")
	public static WebElement Mobilenumber;
	@FindBy(xpath="//button[@class='btn-one thm-bg-clr']")
	public static WebElement submit;
	@FindBy(xpath="//*[@name='submitotp']")
	public static WebElement submitotp;

}
