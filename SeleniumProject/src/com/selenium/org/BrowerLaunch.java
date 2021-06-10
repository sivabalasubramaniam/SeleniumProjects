package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerLaunch {
	
public static void faceBookLogin() {
System.setProperty("webdriver.chrome.driver", "./src/Brower_Driver/ChromeDriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://adactin.com/HotelApp");
System.out.println("successfully open");
driver.findElement(By.className("login_register")).click();
driver.findElement(By.name("username")).sendKeys("SivaBalasubramaniam");
driver.findElement(By.name("password")).sendKeys("20102647");
driver.findElement(By.id("re_password")).sendKeys("20102647");
driver.findElement(By.id("full_name")).sendKeys("spartans");
driver.findElement(By.id("email_add")).sendKeys("sivabalasundaravel@gmail.com");
driver.findElement(By.id("captcha-form")).sendKeys("esopus");
driver.findElement(By.id("tnc_box")).click();
driver.findElement(By.className("reg_button")).click();
}
	public static void main(String[] args) throws Throwable { 
faceBookLogin();
	}

}
