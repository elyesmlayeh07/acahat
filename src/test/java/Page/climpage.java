package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.config;

public class climpage {
	@FindBy(xpath="/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> productList;
	
	public climpage () {
		PageFactory.initElements(config.driver, this);

}
	public void clickOnProductByName (String productTitle) {
		for(WebElement product: productList) {
			if(product.getText().contains(productTitle)) {
				product.click();
		}
		}
		
}
}