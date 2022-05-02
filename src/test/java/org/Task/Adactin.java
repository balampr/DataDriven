package org.Task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseTaskDriven {
public static void main(String[] args) throws IOException {
	openChromeBrowser();
	launchUrl(" http://www.adactin.com/HotelApp/");
	maxWindow();
	WebElement reg = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	reg.click();
	WebElement username = driver.findElement(By.id("username"));
	toFillTextBox(username, readExcelSheet("F:\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 1, 0, "Booking"));
	WebElement pass = driver.findElement(By.id("password"));
	toFillTextBox(pass, readExcelSheet("F:\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 1, 1, "Booking"));
	WebElement password = driver.findElement(By.id("re_password"));
	toFillTextBox(password, readExcelSheet("F:\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 1, 2, "Booking"));
	WebElement fullname = driver.findElement(By.id("full_name"));
	toFillTextBox(fullname, readExcelSheet("F:\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 1, 3, "Booking"));
	WebElement email = driver.findElement(By.id("email_add"));
	toFillTextBox(email, readExcelSheet("F:\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 1, 4, "Booking"));
	driver.findElement(By.id("tnc_box")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
