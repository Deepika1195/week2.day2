package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
				//Step 3: Load the URL 
				driver.get("http://leafground.com/pages/Button.html");
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				// Step 5: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// Step 6: Fill in all the text boxes
				String title = driver.getTitle();
				System.out.println("title:"+title);
				//7 Click button to travel home page
				driver.findElement(By.id("home")).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				//8 Find position of button (x,y)
				Point location = driver.findElement(By.id("position")).getLocation();
				System.out.println("Location is " + location);
				// 9Find button color
				String cssValue = driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getCssValue("background-color");
				System.out.println("colour is " + cssValue);
				//10 Find the height and width

			Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
				System.out.println("Dimension is "+size);
				


	}

}
