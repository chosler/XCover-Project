package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class StartPage {

	WebDriver driver;

	public StartPage(WebDriver driver) {
		
		this.driver = driver;

	}
	
	By eyewearSelection = By.cssSelector("button[id='sunglasses-insurance']");
	By submitButton = By.cssSelector("button[class*='fJDiUv']");

	public void clickOnSelectCategory() {
		driver.findElement(eyewearSelection).click();
	}
	
	public void clickOnSubmitButton() {
		driver.findElement(submitButton).sendKeys(Keys.RETURN);
	}
	
}
