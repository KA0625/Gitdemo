package qaclickacademy;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.GeckoDriverService;

public class Base {
	WebDriver driver;
	public WebDriver intializeDriver() throws IOException {
		
Properties prop = new Properties();
FileInputStream fis = new FileInputStream("C:\\Users\\Aathirai\\mavenjava\\src\\main\\java\\data.properties");
		
prop.load(fis);	
String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
				
		}

		else if(browsername=="firefox"){
			
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\geckodriver.exe");
			// driver= new GeckoDriverService();
			
			
		}
		else if(browsername=="internetExplorer"){
			
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\IEDriverServer.exe");
			// driver=new IE();
		}
	
	
	return driver;
	}



	}


