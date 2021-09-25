package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	private static Object leadName;

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
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Email
				driver.findElement(By.xpath("//span[text() ='Email']")).click();
				// 9.EnterEmail
				driver.findElement(By.name("emailAddress")).sendKeys("xyz@gmail.com");
				//10.Click find leads button
				driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
				//11.Capture name of First Resulting lead
			
				WebElement firstLead =driver.findElement(By.xpath("(//a[text() ='Deepika'])[1]"));
				String leadName = firstLead.getText();
				System.out.println(leadName);
				//12	Click First Resulting lead
				firstLead.click();	
				//13	Click Duplicate Lead
				driver.findElement(By.linkText("Duplicate Lead")).click();
				//14	Verify the title as 'Duplicate Lead'
				String title1 = driver.getTitle();
				System.out.println("title:"+title1);
				String duplicateHeader = driver.findElement(By.xpath("//div[@class='frameSectionExtra']/preceding-sibling::div")).getText();
				System.out.println(duplicateHeader);
				//15	Click Create Lead
				driver.findElement(By.name("submitButton")).click();
				// 16 Confirm the duplicated lead name is same as captured name
				String createdName = driver.findElement(By.xpath("//span[text() ='Deepika']")).getText();
				System.out.println(createdName);
				
				
				if (createdName.equals(leadName)) {
					System.out.println("Duplicate created - Scriprt Passed");
				}else System.out.println("Script Failed Duplicate name mismatched");
				
				driver.quit();

	}

}
