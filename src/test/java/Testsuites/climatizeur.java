package Testsuites;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.config;
import Page.climpage;

public class climatizeur {
	@Test
	public  void clikElement() {
	config.driver = new ChromeDriver();
	config.confchrome();
	config.maximiseWindow();
	String url = "https://www.samsungtunisie.tn/fr/39-climatiseur-samsung-tunisie"; 
    config.driver.get(url); 
	climpage neufmille=new climpage();
	neufmille.clickOnProductByName("Climatiseur Samsung 9000 BTU Digital Inverter");

	}

	

}
