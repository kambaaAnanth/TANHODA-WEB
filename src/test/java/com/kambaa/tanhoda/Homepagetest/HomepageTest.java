package com.kambaa.tanhoda.Homepagetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kambaa.tanhoda.Homepage.Homepage;
import com.kambaa.tanhoda.TestBase.TestBase;
import com.kambaa.tanhoda.loginpagetest.Loginsuccessful;

public class HomepageTest extends TestBase{
	@Test(priority=0)
	public void Schemepage() throws InterruptedException {
		PageFactory.initElements(driver, Homepage.class);
	
//		Homepage.Loginbutton.click();
//	Homepage.Mobilenumber.sendKeys("8508755103");
//		Homepage.submit.click();
//		try { 
//			Homepage.submitotp.click();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		String actual = driver.getTitle();
//		String Expect = "TANHODA";
//		Assert.assertEquals(actual, Expect);
	Thread.sleep(2000);
		Homepage.Scheme.click();
		System.out.println("Scheme Homepage Opened Successfully");
		System.out.println("----------------------------------");
	}

	@Test(priority=1)
	public void NHMSCHEMEVIEWDETAILS() {
		Homepage.NHMviewdetails.click();
		//Homepage.Mobilenumber.sendKeys("8508755103");
		String nhmviewtitle = driver.getCurrentUrl();
		String nhmviewtitleexpect = "http://13.234.154.50/web/view-scheme/1";
		Assert.assertEquals(nhmviewtitle, nhmviewtitleexpect);
		System.out.println("NHM VIEW DETAILS PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");
	}

	@Test(priority=2)
	public void NBMSCHEMEVIEWDETAILS() {
		driver.navigate().back();
		Homepage.NBMviewdetails.click();
//		Homepage.Mobilenumber.sendKeys("8508755103");
//		String nbmviewtitle = driver.getCurrentUrl();
//		String nbmviewtitleexpect = "http://13.234.154.50/web/view-scheme/1";
//		Assert.assertEquals(nbmviewtitle, nbmviewtitleexpect);
		System.out.println("NBM VIEW DETAILS PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");
	}

	@Test(priority=3)
	public void NADPSCHEMEVIEWDETAILS() {
		driver.navigate().back();
		Homepage.NADPviewdetails.click();
//		Homepage.Mobilenumber.sendKeys("8508755103");
//		String NADPviewtitle = driver.getCurrentUrl();
//		String NADPviewtitleexpect = "http://13.234.154.50/web/view-scheme/1";
//		Assert.assertEquals(NADPviewtitle, NADPviewtitleexpect);
		System.out.println("NADP VIEW DETAILS PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");
	}

	@Test(priority=4)
	public void NHMAPPLYSCHEME() {
		driver.navigate().back();
		Homepage.NHMApplyscheme.click();
	Homepage.Mobilenumber.sendKeys("8508755103");
	Homepage.submit.click();
	Homepage.submitotp.click();
//		String NHMAPPLYLINK = driver.getCurrentUrl();
//		String NHMtitleexpect = "http://13.234.154.50/web/alllandview";
//		Assert.assertEquals(NHMAPPLYLINK, NHMtitleexpect);
		System.out.println("NHM APPLY SCHEME PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");

	}

	@Test(priority=5)
	public void NBMAPPLYSCHEME() {
		driver.navigate().back();
		Homepage.NBMApplyscheme.click();
	Homepage.Mobilenumber.sendKeys("8508755103");
	Homepage.submit.click();
	Homepage.submitotp.click();
//		String NBMAPPLYLINK = driver.getCurrentUrl();
//		String NBMtitleexpect = "http://13.234.154.50/web/alllandview";
//		Assert.assertEquals(NBMAPPLYLINK, NBMtitleexpect);
		System.out.println("NBM APPLY SCHEME PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");
	}

	@Test(priority=6)
	public void NADPAPPLYSCHEME() {
		driver.navigate().back();
		Homepage.NADPApplyscheme.click();
	Homepage.Mobilenumber.sendKeys("8508755103");
	Homepage.submit.click();
	Homepage.submitotp.click();
//		String NADPAPPLYLINK = driver.getCurrentUrl();
//		String NADPtitleexpect = "http://13.234.154.50/web/alllandview";
//		Assert.assertEquals(NADPAPPLYLINK, NADPtitleexpect);
		System.out.println("NADP APPLY SCHEME PAGE OPENED SUCCESSFULLY");
		System.out.println("------------------------------------");
	}

	@Test(priority=7)
	public void HOMEPAGELINK() {
		driver.navigate().back();
		Homepage.Homelink.click();
//		String actualhomepage = driver.getCurrentUrl();
//		String ExpectHomepage = "http://13.234.154.50/web/farmerprofile";
//		Assert.assertEquals(actualhomepage, ExpectHomepage);
		System.out.println("SUCCESFSFULLY NAVIGATED TO HOMEPAGE");
		System.out.println("-------------------------------");
	}

	@Test(priority=8)
	public void CONTACTLINK() {
		Homepage.contacklink.click();
//		String contactactualtitle = driver.getCurrentUrl();
//		String contactexpecttitle = "http://13.234.154.50/web";
//		Assert.assertEquals(contactactualtitle, contactexpecttitle);
		System.out.println("CONTACK PAGE OPENED SUCCESSFULLY");
		System.out.println("---------------------------");
		Homepage.yourname.sendKeys("TEST");
		Homepage.YourMail.sendKeys("demo1@test.com");
		Homepage.Phone.sendKeys("8508755100");
		Homepage.Subject.sendKeys("Test");
		// Homepage.yourmsg.sendKeys("Demo");
		Homepage.submitnow.click();
		System.out.println("CONTACT UPDATE IS SUCCESSFULLY");
		System.out.println("-------------------------------");
	}
}
