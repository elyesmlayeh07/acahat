package Testsuites;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.config;
import Page.Pannier;

public class AjoutPannierRunner {
	@Test
	public  void clikElement() throws Exception {
	config.driver = new ChromeDriver();
	config.confchrome();
	config.maximiseWindow();
	String url = "https://www.samsungtunisie.tn/fr/climatiseur-samsung-tunisie/677-1348-climatiseur-samsung-9000-btu-digital-inverter-prix-tunisie.html#/8-couleur-blanc"; 
    config.driver.get(url); 
Pannier page = new Pannier();
page.ajoutpannier("Climatiseur Samsung 9000 BTU Digital Inverter");


}
}
