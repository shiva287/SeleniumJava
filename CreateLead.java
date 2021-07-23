package Week2Assignment2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		//Login
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    
	    
	    //createContact
	    driver.findElementByXPath("//a[@href='/crmsfa/control/contactsMain']").click();
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Create Contact").click();
	    
	    driver.findElementById("firstNameField").sendKeys("Assignment_Firstname");
	    driver.findElementById("lastNameField").sendKeys("Assignment_Lastname");
	    
	    driver.findElementById("createContactForm_firstNameLocal").sendKeys("Local Firstname");
	    driver.findElementById("createContactForm_lastNameLocal").sendKeys("Local Lastname");
	    
	    
	    driver.findElementById("createContactForm_departmentName").sendKeys("Department");

	    driver.findElementById("createContactForm_description").sendKeys("Description text sample, Description text sample ,Description text sample ,Description text sample Description text sampleDescription text sample,Description text sample,Description text sample,Description text sample");

	    driver.findElementById("createContactForm_primaryEmail").sendKeys("shiva287@gmail.com");
	    
	    Select state = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
	    state.selectByVisibleText("New York");
	    //driver.findElementByXPath("//a[@href='/crmsfa/control/contactsMain']").click();
	    
	    
	  //input[@name="submitButton"]
	    driver.findElementByXPath("//input[@name='submitButton']").click();
	    
	    Thread.sleep(6000);
	    
	   String edit_Page = driver.getTitle();
	   String expected_page = "View Contact | opentaps CRM";
	   
	   if(expected_page.equals(edit_Page))
	   {
		   driver.findElement(By.linkText("Edit")).click();
		   Thread.sleep(4000);
		   String title_editpage =  driver.getTitle();
		   String edit_pagetitle = "opentaps CRM";
		   
		  if (title_editpage.equals(edit_pagetitle))
		  {
			  driver.findElementById("updateContactForm_description").clear();
			  driver.findElementById("updateContactForm_importantNote").sendKeys("ASADASDASDa Description text sample, Description text sample ,Description text sample ,Description text sample Description text sampleDescription text sample,Description text sample,Description text sample,Description text sample");

			  driver.findElementByXPath("//input[@value='Update']").click();
			  System.out.println("done with editing");
			  
			  driver.close(); 
			  
		  }
		  
		  else
			  System.out.println("Failed during Editing");
		 
	   }
	   else 
	   {
		   System.out.println("Not redirected to Edit page yet - so exiting ");
		   driver.close();
	   }
	
	   
	   

	    
	}

}
