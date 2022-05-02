package org.Task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinBooking extends BaseTaskDriven {

	public static void main(String[] args) throws IOException {

		openChromeBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();

		WebElement user = driver.findElement(By.id("username"));
		toFillTextBox(user, "bala2828");

		WebElement pass = driver.findElement(By.id("password"));
		toFillTextBox(pass, "9655voda");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		adactinPom ad = new adactinPom();
		WebElement loc = ad.getLocation();
		DropDownBy_Index(loc, 1);

		WebElement rest = ad.getHotel();
		DropDownBy_Index(rest, 2);

		WebElement type = ad.getRoomtype();
		DropDownBy_Index(type, 4);

		WebElement no = ad.getRoomno();
		DropDownBy_Index(no, 1);

		WebElement dateIn = ad.getFrom();
		toFillTextBox(dateIn, "16/05/2022");

		WebElement dateOut = ad.getTo();
		toFillTextBox(dateOut, "18/05/2022");

		WebElement adult = ad.getMember();
		DropDownBy_Index(adult, 2);

		WebElement but = ad.getSearchButton();
		but.click();

		WebElement rad = ad.getRadioclick();
		rad.click();

		WebElement con = ad.getContinuebutton();
		con.click();

		WebElement name = ad.getFirstname();
		toFillTextBox(name,
				readExcelSheet("F:\\Backups testing\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 3, 0, "Booking"));

		WebElement lname = ad.getLastName();
		toFillTextBox(lname,
				readExcelSheet("F:\\Backups testing\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 3, 1, "Booking"));

		WebElement add = ad.getAddress();
		toFillTextBox(add,
				readExcelSheet("F:\\Backups testing\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 3, 2, "Booking"));

		WebElement creditcard = ad.getCredit();
		toFillTextBox(creditcard,
				readExcelSheet("F:\\Backups testing\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 3, 3, "Booking"));

		WebElement ctype = ad.getCreditType();
		DropDownBy_Index(ctype, 2);

		WebElement cMonth = ad.getSelectMonth();
		DropDownBy_Index(cMonth, 10);

		WebElement cYear = ad.getSelectYear();
		DropDownBy_Index(cYear,11 );

		WebElement cv = ad.getCVV();
		toFillTextBox(cv,
				readExcelSheet("F:\\Backups testing\\Maven\\DATADRIVEN\\External\\Adactin.xlsx", 3, 4, "Booking"));

		WebElement conf = ad.getBook();
		conf.click();
		
	}
}
