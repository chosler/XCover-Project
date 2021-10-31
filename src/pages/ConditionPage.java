package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConditionPage {
	
	WebDriver driver;
	
	public ConditionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By conditionBox = By.cssSelector("div[class$='1hwfws3']");
	By newButton = By.cssSelector("div[id='react-select-2-option-0']");
	
	public void fillCondition() {		
		driver.findElement(conditionBox).click();
	}
	
	public void selectNew() {
		driver.findElement(newButton).click();;
	}

}
