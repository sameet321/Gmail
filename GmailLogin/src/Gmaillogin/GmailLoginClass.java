package Gmaillogin;//created a package

import org.openqa.selenium.WebDriver;//importing the selenium jar files
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the path for gecko driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pavit\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
  		WebDriver driver = new FirefoxDriver(); //launch firefox Browser
  		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");//get the url of gmail
  		
  		driver.findElement(By.id("identifierId")).sendKeys("sam229028@gmail.com");// enter the email id
  		 WebDriverWait wait=new WebDriverWait(driver, 20); 
  		System.out.println("Email id entered successfully");//print the message
  		
  		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); //click on next button
  		System.out.println("Next Button clicked successfully");//print the message
  		
  		try {
			Thread.sleep(1000);//wait inorder to refresh elements on page 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //wait inorder to refresh elements on page    

         driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Sam@123!@#"); // enter the password         
     	System.out.println("Password entered successfully");//print the message
         driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); //click on next button
     	System.out.println("Next Button clicked successfully");     //print the message  

       	  	driver.close();//closes the browser
	}

}
