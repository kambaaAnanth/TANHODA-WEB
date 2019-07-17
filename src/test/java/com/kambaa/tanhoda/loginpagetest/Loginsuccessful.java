package com.kambaa.tanhoda.loginpagetest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.kambaa.tanhoda.TestBase.TestBase;
import com.kambaa.tanhoda.loginpage.Loginpage;

public class Loginsuccessful extends TestBase {
@Test
public void Loginsuccess(){
	PageFactory.initElements(driver, Loginpage.class);
	try{
	Loginpage.Loginbutton.click();
	}catch(Exception e){
		e.printStackTrace();
	}
	Loginpage.Mobilenumber.sendKeys("8508755103");
	Loginpage.submit.click();
	try{
	Loginpage.submitotp.click();
	}catch(Exception e){
		e.printStackTrace();
	}
	String actual=driver.getTitle();
	Assert.assertEquals("TANHODA", actual);
	System.out.println("Login successfully");
	System.out.println("--------------------------");
}
@Test
public void Loginunsuccessful(){
	PageFactory.initElements(driver, Loginpage.class);
	try{
	Loginpage.Loginbutton.click();
	}catch(Exception e){
		e.printStackTrace();
	}
	Loginpage.Mobilenumber.sendKeys("8508755111");
	Loginpage.submit.click();
	//Loginpage.submitotp.click();
    String actualerror=driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText();
    System.out.println(actualerror);
//	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	try {
//		Files.copy(scrFile, new File("C:\\Users\\kavya\\Desktop\\TANHODA\\tanhodafarmer.web\\Screenshot\\loginunsuccessful.jpg"));
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//}
	System.out.println("Login Unsucceessfull");
	System.out.println("------------------------------------");
}
}
