package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 	

		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/	
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		//Step 7:Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Deepika");
		//Step 8:Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("Murugan");
		//Step 9:Enter Mobile Number
		driver.findElement(By.name("reg_email__")).sendKeys("8248210577");
		//Step 10: Enter New Password
		
		driver.findElement(By.id("password_step_input")).sendKeys("Deepi@1106");
		// Step 11: Handle all the three drop downs
		
		WebElement Drop1 = driver.findElement(By.id("day"));
		Select S1 = new Select(Drop1);
		S1.selectByVisibleText("11");
		WebElement Drop2 = driver.findElement(By.id("month"));
		Select S2 = new Select(Drop2);
		S2.selectByVisibleText("Jun");
		WebElement Drop3 = driver.findElement(By.id("year"));
		Select S3 = new Select(Drop3);
		S3.selectByVisibleText("1995");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
