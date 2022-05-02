package org.Task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactinPom extends BaseTaskDriven {
	// non parameterized constructor
	public adactinPom() {
		PageFactory.initElements(driver, this);

	}
// private webelement

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(name = "room_nos")
	private WebElement roomno;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement from;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement to;

	@FindBy(name = "adult_room")
	private WebElement member;

	@FindBy(id = "Submit")
	private WebElement searchButton;

	@FindBy(name = "continue")
	private WebElement continuebutton;

	@FindBy(id = "radiobutton_0")
	private WebElement radioclick;

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement credit;

	@FindBy(name = "cc_type")
	private WebElement creditType;

	@FindBy(id = "cc_exp_month")
	private WebElement selectMonth;

	@FindBy(name = "cc_exp_year")
	private WebElement selectYear;

	@FindBy(id = "cc_cvv")
	private WebElement CVV;

	@FindBy(name = "book_now")
	private WebElement book;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getMember() {
		return member;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getRadioclick() {
		return radioclick;
	}

}
