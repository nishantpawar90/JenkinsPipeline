package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyClass {

	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");

	}

	@Test
	public void myMethod() {
		driver.findElement(By.xpath("//a[text()='Frames and Windows']")).click();
		System.out.println("Case Executed Nishant");
	}

	@AfterTest
	public void AfterMethod() {

		driver.quit();

	}
}
