package org.formation;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class TestHotel extends AbstractTest {
	
@Before
public void setup () {
	selectBrowser(browser);
	System.out.println("setup");	
}
@After
public void teardown() {
	//driver.quit();
}

@Test
public void TestHotel() {
	driver.get("http://192.168.43.193:8080/HotelWebapp/");
	
	//vérification de la page et sélection des hotels à Tokyo + clic recherche 

	Assert.assertEquals("Application Tutoriel pour la base de données des hotels", driver.findElement(By.xpath("//h2")).getText());
	
	WebElement menu = driver.findElement(By.xpath("//select"));
	Select Cityselect = new Select(menu);
	
	Cityselect.selectByValue("Tokyo");
	driver.findElement(By.xpath("//button")).click();
	
	//La page avec les hotels à Tokyo apparait
	
	Assert.assertEquals("Hôtels disponibles à Tokyo", driver.findElement(By.xpath("//body/h3[2]")).getText());
	
	
}


}
