package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//Step 3: Load the URL 
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Fill in all the text boxes
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Deepika");
		driver.findElement(By.name("UserLastName")).sendKeys("Murugan");
		driver.findElement(By.name("UserEmail")).sendKeys("deepikamurugan1106@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Amazon");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567800");
		
		WebElement Drop1 = driver.findElement(By.name("UserTitle"));
		Select S1 = new Select(Drop1);
		S1.selectByValue("Developer");
		WebElement Drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select S2 = new Select(Drop2);
		S2.selectByVisibleText("1501+ employees");
		WebElement Drop3 = driver.findElement(By.name("CompanyCountry"));
		Select S3 = new Select(Drop3);
		S3.selectByIndex(1);
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.quit();
		
		
	}

}
