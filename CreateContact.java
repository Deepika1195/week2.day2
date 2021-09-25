package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
				//Step 3: Load the URL 
				driver.get("http://leaftaps.com/opentaps/control/main");
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				// Step 5: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// Step 6: Fill in all the text boxes
				String title = driver.getTitle();
				System.out.println("title:"+title);
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("demosalesmanager");
				WebElement passWord = driver.findElement(By.id("password"));
				passWord.sendKeys("crmsfa");
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();
				WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
				crmsfaLink.click();
			//Step 6:Click on Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				//Step 7. Enter FirstName Field Using id Locator
			driver.findElement(By.id("firstNameField")).sendKeys("Deepika");
			//Step 8. Enter LastName Field Using id Locator
			
			driver.findElement(By.id("lastNameField")).sendKeys("Murugan");
			//Step 9.Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Deeps");
			//Step 10.Enter LastName(Local) Field Using id Locator
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Deeps");
			
			//Step 11. Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.name("departmentName")).sendKeys("IT");
			
			//Step 12.Enter Description Field Using any Locator of your choice 
			driver.findElement(By.name("description")).sendKeys("My current role is Manual Testing");
			// Step 13. Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.name("primaryEmail")).sendKeys("deep@gmail.com");
			//Step 14. Select State/Province as NewYork Using Visible Text
			
	WebElement dropdown1 = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select S1 = new Select(dropdown1);
	S1.selectByVisibleText("New York");
	// Step 15. Click on Create Contact
	driver.findElement(By.name("submitButton")).click();
	
	//Step 16. Click on edit button
	driver.findElement(By.linkText("Edit")).click();
	//Step 17. Clear the Description Field using .clear	
	driver.findElement(By.name("description")).clear();
	//Step 18. Fill ImportantNote Field with Any text
	driver.findElement(By.name("importantNote")).sendKeys("Week2day2 assignment is huge");
	//Step 19. Click on update button using Xpath locator
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	
	//Step 20. Get the Title of Resulting Page.
			String title1 = driver.getTitle();
			System.out.println("title : " +title1);
			System.out.print(" Executed Successfully");
			driver.quit();
	}
	

	
		
	}


		
	


