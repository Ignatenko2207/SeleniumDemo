package info.sjd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.sjd.service.WebDriverService;
import info.sjd.util.Timer;

public class ApplicationRunner {

	public static void main(String[] args) {

		WebDriver driver = WebDriverService.getWebDriver();
		
		driver.get("https://makeup.com.ua");
		
		Timer.getPause(5);
		
		WebElement searchInput = driver.findElement(By.id("search-input"));
		searchInput.sendKeys("deodorant");
		
		WebElement submitElement = driver.findElement(By.className("search-button"));
		
		submitElement.submit();
		
		Timer.getPause(5);
		
		String currentURL = driver.getCurrentUrl();
		
		driver.get(currentURL);
		
		Timer.getPause(5);
		
		System.out.println("The end!");
		driver.quit();
	}

}
