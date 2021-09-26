package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//Step 3: Load the URL 
		driver.get("http://leafground.com/pages/Edit.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Fill in all the text boxes
		String title = driver.getTitle();
		System.out.println("title:"+title);

// 7 Enter your email address
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		// 8 Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("values added", Keys.TAB);
		//9 Get default text entered
		System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following::input")).getAttribute("value"));
		// 10 Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		//11 Confirm that edit field is disabled
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled());
	}

}
