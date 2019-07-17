package com.kambaa.tanhoda.Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kambaa.tanhoda.TestBase.TestBase;

public class Homepage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	public static WebElement Loginbutton;
	@FindBy(xpath = "//input[@placeholder='Mobile Number*']")
	public static WebElement Mobilenumber;
	@FindBy(xpath = "//button[@class='btn-one thm-bg-clr']")
	public static WebElement submit;
	@FindBy(xpath = "//*[@name='submitotp']")
	public static WebElement submitotp;
	@FindBy(xpath = "//li[contains(@class,'dropdown')]//a[contains(text(),'Home')]")
	public static WebElement Homelink;
	@FindBy(xpath = "//li[contains(@class,'dropdown')]//a[contains(text(),'Schemes')]")
	public static WebElement Scheme;
	@FindBy(xpath = "//li[contains(@class,'dropdown')]//a[contains(text(),'Contact Us')]")
	public static WebElement contacklink;
	@FindBy(xpath = "//div[@class='slide-content middle-slide text-center']//a[@class='btn-one thm-bg-clr'][contains(text(),'Click Here')] ")
	public static WebElement subsidy;
	@FindBy(linkText = "VIEW DETAILS")
	public static WebElement NHMviewdetails;
	@FindBy(linkText = "VIEW DETAILS")
	public static WebElement NBMviewdetails;
	@FindBy(linkText = "VIEW DETAILS")
	public static WebElement NADPviewdetails;
	@FindBy(xpath = "//section[@id='blog-area']//div[@class='row']//div[1]//div[1]//div[3]//a[1]")
	public static WebElement NHMApplyscheme;
	@FindBy(xpath = "//div[2]//div[1]//div[3]")
	public static WebElement NBMApplyscheme;
	@FindBy(xpath = "//section[@id='blog-area']//div[3]//div[1]//div[3]")
	public static WebElement NADPApplyscheme;
	@FindBy(xpath="//input[@placeholder='Your Name*']")
	public static WebElement yourname;
	@FindBy(xpath="//input[@placeholder='Your Mail*']")
	public static WebElement YourMail;
	@FindBy(xpath="//input[@placeholder='Phone']")
	public static WebElement Phone;
	@FindBy(xpath=" //input[@placeholder='Subject']")
	public static WebElement Subject;
	@FindBy(xpath="//textarea[@placeholder='Your Message..']")
	public static WebElement yourmsg;
	@FindBy(xpath="//*[@data-loading-text='Please wait...']")
	public static WebElement submitnow;
	 //*[@class='navigation clearfix']/li

}
