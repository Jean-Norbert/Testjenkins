package org.formation;

import org.formation.HotelTestIntegrContinue.EBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class AbstractTest {
	
	EBrowser browser = EBrowser.chrome;
	protected WebDriver driver;
	


	public void selectBrowser(EBrowser b) {
		if(b.equals(EBrowser.edge)) {
			System.setProperty("webdriver.edge.driver", "src/main/resources/driver/msedgedriver.exe"); 
			driver = new EdgeDriver();
		}

		else if(b.equals(EBrowser.firefox)) {
			System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe"); 
			driver = new FirefoxDriver();
		}

		else if(b.equals(EBrowser.chrome)) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe"); 
			driver = new ChromeDriver();
		}
	}
	
}
