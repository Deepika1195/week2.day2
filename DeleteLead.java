package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text() ='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		// 9.Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("0123456789");
		//10.Click find leads button
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		//11.Capture lead ID of First Resulting lead
		driver.findElement(By.linkText("13177")).click();
		//12.Click Delete
		driver.findElement(By.linkText("Delete")).click();
		//13.Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//14.Enter captured ID
		
		driver.findElement(By.name("id")).sendKeys("13177");
		//15.Click find leads button
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		
		WebElement FinalMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String mesg = FinalMessage.getText();
		System.out.println(mesg);
		if (mesg.equals("No records to display")) {
			System.out.println("This message confirms the successful deletion  SCRIPT PASSED");	
		}else System.out.println("Script Failed");
		//18	Close the browser (Do not log out)*/
		driver.quit();
				
}

}
