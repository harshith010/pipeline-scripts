package care.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printName {
public static void main(String[] args) throws InterruptedException, IOException {
	//WebDriver driverc= new ChromeDriver();
	//driverc.get("https://www.google.com");
	WebDriver driver= new FirefoxDriver();
	//driver.get("https://www.saucedemo.com/");
	//driver.quit();
	FileInputStream fis= new FileInputStream("C:\\Users\\sanvi\\Desktop\\dataDriven.properties");
	Properties pobj= new Properties();
	pobj.load(fis);
	String USER_NAME = pobj.getProperty("username");
	String PWD = pobj.getProperty("pwd");
	String URL= pobj.getProperty("url");
	driver.get(URL);
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	user.sendKeys(USER_NAME);
	pass.sendKeys(PWD);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	System.out.println("-------Login unssuccess-----------");
	
	
	
}
}
