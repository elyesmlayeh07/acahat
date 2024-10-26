package Page;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.config;

public class Pannier {
	
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
	WebElement acheter;
	@FindBy(css ="button.btn.btn-secondary[data-dismiss='modal']")
	WebElement finaliser;
@FindBy(id="cart-block")
WebElement panier;
@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
WebElement productv;
public Pannier() {
	PageFactory.initElements(config.driver, this);
	
}
public void ajoutpannier (String producttitle) throws Exception {
	Thread.sleep(3000);
	acheter.click();
	config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(config.driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeSelected(finaliser));
	finaliser.click();
	config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
panier.click();
Assert.assertEquals(productv.getText(), producttitle);

}
	
		
	

}
