package com.citizant.order.service;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OrderOnlineTest {

	private String Seleniumhub = "http://50.19.179.31:4444/wd/hub";
	private String baseUrl =  "http://54.152.33.121:8080/login";
	private static WebDriver driver;
	private WebDriverWait driverWait;
	private String actualTitle;
		
	
@Before
public void openBrowser() {
	System.out.println("* * * Test Started! * * *");

String hub = System.getProperty("Selenium.hub");
if(hub == null) {
hub = Seleniumhub;
}

String base = System.getProperty("app.baseurl");
if(base == null) {
base = baseUrl;
}
System.out.println("Selenium HUB : " + hub);
System.out.println("The app URL : " + base);

URL hubUrl = null;
try{
	
	System.out.println("Hello");
hubUrl = new URL(hub);
}catch(Exception e){

}

Capabilities cap = DesiredCapabilities.firefox();
System.out.println("Hello1");
driver = new RemoteWebDriver(hubUrl, cap);
System.out.println("Hello2");
driverWait = new WebDriverWait(driver, 30);
System.out.println("Hello3");
driver.get(base);
// screenshotHelper = new ScreenshotHelper();
}

@After
public void saveScreenshotAndCloseBrowser() throws IOException {
//screenshotHelper.saveScreenshot("screenshot.png");
driver.quit();
}
	
@Test
public void bootcampjavatest() throws Exception {
		//System.out.println("Hello4");
driver.findElement(By.name("username")).sendKeys("guest");
driver.findElement(By.name("password")).sendKeys("guest");
System.out.println("username:");
System.out.println("pw:");
driver.findElement(By.name("submit")).click();
Thread.sleep(1000);


driver.findElement(By.cssSelector("a[href*='list']")).click();
driver.findElement(By.cssSelector("a[href*='add']")).click();
Thread.sleep(1000);

driver.findElement(By.id("desc")).sendKeys("ABug");

Thread.sleep(1000);


WebElement dateBox = driver.findElement(By.id("targetDate"));
dateBox.sendKeys("30/03/2018");
//driver.findElement(By.name("submit")).click();
String actualTitle = driver.getTitle();

String expectedTitle = "orders Application";
assertEquals(expectedTitle,actualTitle);
System.out.println("ActualTitle is " + actualTitle );

}
}

