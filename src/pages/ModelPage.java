package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ModelPage {
	
	WebDriver driver;
	
	public ModelPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By modelBox = By.cssSelector("input[name='model']");
	
	public void fillModelBox(String model) {
		driver.findElement(modelBox).sendKeys(model);
		driver.findElement(modelBox).sendKeys(Keys.RETURN);
		
	}

}
