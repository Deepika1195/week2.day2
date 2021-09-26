package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String link = driver.findElement(By.xpath("(//a[@link='blue'])[2]")).getAttribute("href");
		System.out.println("Link url href  " + link);

		String broke = driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		if (broke.contains("error")) {
			System.out.println("This is broken URL" + broke);
		} else
			System.out.println("Link is valid");

//		for (int i = 0; i < 6; i++) {
//		driver.findElement(By.xpath("//a[i+']")).getSize();
//		System.out.println(driver.findElement(By.xpath("//a[i]")).getSize());
//		}

		// go to home page

		System.out.println(driver.getTitle());

		// interact with same link
		driver.findElement(By.xpath("(//a[@link='blue'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();
		System.out.println(driver.getTitle());
	}

}
