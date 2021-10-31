package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.StartPage;
import pages.AddressPage;
import pages.ProductPage;
import pages.ModelPage;
import pages.PurchasePricePage;
import pages.PurchaseDatePage;
import pages.ConditionPage;
import pages.QuotePage;

public class GetQuote_TC1 {
	
	WebDriver driver=new ChromeDriver();
	
	@BeforeClass
	public void initialize() throws Exception {
		
		driver.get("http://xcover.com/en/get-quote/product");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void LandingPage() {
		
		String expectedTitle = "XCover.com";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test
	public void QuotePage() throws InterruptedException {
		
		StartPage start = new StartPage(driver);
		
		AddressPage address = new AddressPage(driver);
		
		ProductPage product = new ProductPage(driver);
		
		ModelPage model = new ModelPage(driver);
		
		PurchasePricePage purchasePrice = new PurchasePricePage(driver);
		
		PurchaseDatePage purchaseDate = new PurchaseDatePage(driver);
		
		ConditionPage condition = new ConditionPage(driver);
		
		QuotePage quote = new QuotePage(driver);
		
		start.clickOnSelectCategory();
		start.clickOnSubmitButton();
		
		address.enterAddress("680 George Street, Sydney NSW, Australia");
		start.clickOnSubmitButton();
		
		product.fillProduct("Rayban");
		
		model.fillModelBox("Clubmaster");
		
		purchasePrice.fillPriceBox("200");
		
		purchaseDate.selectDateBox();
		purchaseDate.selectDate("17-August-2021");
		start.clickOnSubmitButton();
		
		condition.fillCondition();
		condition.selectNew();
		start.clickOnSubmitButton();
		
		String expectedPaymentMsg = "PROCEED TO PAYMENT";
		String actualMsg = quote.findPaymentButton();
		Assert.assertEquals(actualMsg, expectedPaymentMsg);
	}
	 
	
	@AfterClass
	public void TeardownTest() {
        driver.quit();
    } 
	

}
