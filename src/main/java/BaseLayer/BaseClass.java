package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static Properties prop;
	protected static WebDriver driver;
	
	public BaseClass() {
		prop = new Properties();
		
		String path = System.getProperty("user.dir") +"/src/main/java/ConfigurationLayer/config.properties";
		
		try{
			FileInputStream fis = new FileInputStream(path);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void Initialization() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("Url");
		driver.get(url);
	}
}
