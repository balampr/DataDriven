package org.Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTaskDriven {

	public static WebDriver driver;
	

	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void toHold(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void toFillTextBox(WebElement element, String pass) {
		element.sendKeys(pass);

	}

	public static void fetchTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void DropDownBy_Index(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		
	}

	public static void fetchCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void click(WebElement name) {
		name.click();
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();

	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	public static void copy() throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_C);
		rc.keyRelease(KeyEvent.VK_C);
		rc.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void paste() throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		rc.keyRelease(KeyEvent.VK_V);
		rc.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void takeScreenShot(String picname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Maven\\BASE12\\" + picname + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void scrlDw(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrlUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	} 
	public static String readExcelSheet(String path,int row,int cell,String sheetName) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = book.getSheet(sheetName);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		int Type = c.getCellType();
		
		String input;
		
		if(Type==1) {
			input = c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMMMM/yy");
			input = sim.format(da);
		}
		else {
			double n = c.getNumericCellValue();
			long l =(long)n;
			input = String.valueOf(l);
		}
		return input;
		
		
				
			
			
			
			
		}
		

	}

	
	
	
	
	

