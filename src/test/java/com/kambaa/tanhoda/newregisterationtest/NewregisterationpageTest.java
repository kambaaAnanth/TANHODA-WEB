package com.kambaa.tanhoda.newregisterationtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.kambaa.tanhoda.TestBase.TestBase;
import com.kambaa.tanhoda.newregistrationpage.Newregisterpage;

public class NewregisterationpageTest extends TestBase {
	@Test
	public static void registersuccessful() throws AWTException, InterruptedException {
		PageFactory.initElements(driver, Newregisterpage.class);
		// Basic Details
		Newregisterpage.registerbutton.click();
		Newregisterpage.aadhaar_id.sendKeys("857452542522");
		Newregisterpage.hotnet_id.sendKeys("Test123");
		Newregisterpage.farmer_type.click();
		Select type = new Select(Newregisterpage.farmer_type);
		type.selectByIndex(2);
		Newregisterpage.mobile_number.sendKeys("8508754222");
		Newregisterpage.name.sendKeys("prabhu123");
		Newregisterpage.email.sendKeys("demo@kambaa.com");
		Newregisterpage.gname.sendKeys("K");
		Newregisterpage.gender.click();
		Select gender = new Select(Newregisterpage.gender);
		gender.selectByVisibleText("Male");
		Newregisterpage.social_status.click();
		Select status = new Select(Newregisterpage.social_status);
		status.selectByIndex(5);
		Newregisterpage.DOB.sendKeys("20-02-1994");
		Newregisterpage.age.sendKeys("27");
		try{
		Newregisterpage.qualification.click();
		}catch(Exception e){
			e.printStackTrace();
		}
		Select qualification = new Select(Newregisterpage.qualification);
		qualification.selectByVisibleText("Graduate");
		Newregisterpage.income.sendKeys("100000");
		Newregisterpage.pan_no.sendKeys("2564155525");
		Newregisterpage.ration_card.sendKeys("Test123");
		Newregisterpage.profile_pic.click();
		Robot robot = new Robot();	
		StringSelection selection = new StringSelection(
				"C:\\Users\\kavya\\Documents\\download1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Address Details
		Newregisterpage.state.click();
		Select state = new Select(Newregisterpage.state);
		state.selectByVisibleText("Tamilnadu");
		Newregisterpage.district.click();
		Select district = new Select(Newregisterpage.district);
		district.selectByValue("25");
		Newregisterpage.block.click();
		Select block = new Select(Newregisterpage.block);
		block.selectByValue("313");
		Newregisterpage.village.click();
		Select village = new Select(Newregisterpage.village);
		village.selectByValue("10879");
		Newregisterpage.hamletvillage.sendKeys("Test123");
		Newregisterpage.house_no.sendKeys("313");
		Newregisterpage.street.sendKeys("viruthunagar");
		Newregisterpage.pincode.sendKeys("658144");
		// Bank Details
		Newregisterpage.bank_name.sendKeys("SBI");
		Newregisterpage.ifsc_code.sendKeys("Test123");
		Newregisterpage.branch_name.sendKeys("Viruthunagar");
		Newregisterpage.bank_account_no.sendKeys("Test123");
		Newregisterpage.bank_passbook_copy.click();
		Robot robot1 = new Robot();
		robot1.setAutoDelay(2000);
		StringSelection selection1 = new StringSelection(
				"C:\\Users\\kavya\\Documents\\download2.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection1, null);
		robot1.setAutoDelay(2000);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.setAutoDelay(2000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		// Document Details
		Newregisterpage.aadhaar_copy.click();
		Robot robot2 = new Robot();
		robot2.setAutoDelay(2000);
		StringSelection selection2 = new StringSelection(
				"C:\\Users\\kavya\\Documents\\download3.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection2, null);
		robot2.setAutoDelay(2000);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.setAutoDelay(2000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);

		Newregisterpage.ration_copy.click();
		Robot robot3 = new Robot();
		robot3.setAutoDelay(2000);
		StringSelection selection3 = new StringSelection(
				"C:\\Users\\kavya\\Documents\\download4.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection3, null);
		robot3.setAutoDelay(2000);

		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		robot3.keyRelease(KeyEvent.VK_V);
		robot3.setAutoDelay(2000);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);

		// new Land Details
		Newregisterpage.land_ownership.click();
		Select landowner = new Select(Newregisterpage.land_ownership);
		landowner.selectByVisibleText("Own");
		Newregisterpage.servey_no.sendKeys("1130");
		Newregisterpage.servey_no1.sendKeys("abd");
		Newregisterpage.land_state.click();
		Select Lstate = new Select(Newregisterpage.land_state);
		Lstate.selectByVisibleText("Tamilnadu");
		Newregisterpage.land_district.click();
		Select Ldistrict = new Select(Newregisterpage.land_district);
		Ldistrict.selectByValue("25");
		Newregisterpage.land_block.click();
		Select Lblock = new Select(Newregisterpage.land_block);
		Lblock.selectByValue("313");
		Newregisterpage.land_village.click();
		Select Lvillage = new Select(Newregisterpage.land_village);
		Lvillage.selectByValue("10879");
		Newregisterpage.total_area.sendKeys("2.25");
		Newregisterpage.source_of_irrigation.click();
		Select source = new Select(Newregisterpage.source_of_irrigation);
		source.selectByIndex(2);
		Newregisterpage.patta_copy.click();
		Robot robot4 = new Robot();
		robot4.setAutoDelay(2000);
		StringSelection selection4 = new StringSelection(
				"C:\\Users\\kavya\\Documents\\download1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection4, null);
		robot4.setAutoDelay(2000);
		robot4.keyPress(KeyEvent.VK_CONTROL);
		robot4.keyPress(KeyEvent.VK_V);
		robot4.keyRelease(KeyEvent.VK_CONTROL);
		robot4.keyRelease(KeyEvent.VK_V);
		robot4.setAutoDelay(2000);
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
	String parentwindow=driver.getWindowHandle();
		Newregisterpage.submit.click();	
		for(String childwindow:driver.getWindowHandles()){			
			if(!parentwindow.equals(childwindow)){
				driver.switchTo().window(childwindow);
				Newregisterpage.otpsubmit.click();
			}
			
		}
			
		System.out.println("The New Registration is successful");
		System.out.println("------------------------------------------");
		}	
	public static void main(String[] args) throws AWTException, InterruptedException {
		registersuccessful();
		newregisterationunsuccessful();
	}
	@Test
	public static void newregisterationunsuccessful(){
		PageFactory.initElements(driver, Newregisterpage.class);
		// Basic Details
	Newregisterpage.registerbutton.click();
		Newregisterpage.aadhaar_id.sendKeys("");
		Newregisterpage.hotnet_id.sendKeys("");
		Newregisterpage.farmer_type.click();
		Select type = new Select(Newregisterpage.farmer_type);
	type.selectByIndex(2);
	Newregisterpage.mobile_number.sendKeys("");
		Newregisterpage.name.sendKeys("");
	Newregisterpage.email.sendKeys("");
	Newregisterpage.gname.sendKeys("");
		Newregisterpage.gender.click();
		Select gender = new Select(Newregisterpage.gender);
	gender.selectByVisibleText("");
	Newregisterpage.social_status.click();
		Select status = new Select(Newregisterpage.social_status);
		status.selectByIndex(1);
	Newregisterpage.DOB.sendKeys("");
		Newregisterpage.age.sendKeys("");
		Newregisterpage.submit.click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			Files.copy(scrFile, new File("C:\\Users\\kavya\\Desktop\\TANHODA\\tanhodafarmer.web\\Screenshot\\Registerunsuccessful.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
	}
	System.out.println("Registration Unsuccessful when without enter Mandatory");
		System.out.println("---------------------------------------");
	}
}
