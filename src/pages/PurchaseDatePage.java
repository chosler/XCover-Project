package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PurchaseDatePage {

	WebDriver driver;
	
	public PurchaseDatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By dateBox = By.cssSelector("div[class='DateInput DateInput_1']");
	By calendarLeft = By.cssSelector("div[class*='leftButton']");
	By purchaseDate = By.cssSelector("td[aria-label='Wednesday, September 15, 2021']");
	By calendarMonYr = By.cssSelector("div[class='CalendarMonth_caption CalendarMonth_caption_1']");
	
	
	public void selectDateBox() {
		driver.findElement(dateBox).click();
	}
	
	public void selectDate(String date) throws InterruptedException {
		String splitter[] = date.split("-");
		String year = splitter[2];
		String month = splitter[1];
		String day = splitter[0]; 
		
		List<WebElement> DateElements = driver.findElements(calendarMonYr);
		List<String> DateList = new ArrayList<String>();
	    for (WebElement element : DateElements ) {
	        DateList.add(element.getText());
	    }
	    String curDate = DateList.get(1);
	    String splitDate[] = curDate.split(" ");
	    String curMon = splitDate[0];
	    String curYear = splitDate[1];

	    while(!curYear.equals(year)) {
	    	driver.findElement(calendarLeft).click();
	    	break;
	    }
	    
	   while(curMon!=month) {
	    	driver.findElement(calendarLeft).click();
	    	break;
	    } 
	    
	    List<WebElement> days = driver.findElements(By.tagName("td"));
		for (WebElement cell: days){
			if (cell.getText().equals(day)){
				cell.click();
				break;
			}
		}
	    
	}
	
}
