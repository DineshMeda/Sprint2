package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestUtils;

public class Testbase {
	
	public static Properties props;
	public static WebDriver driver;
	public static TestUtils testutils;
	public Testbase() throws IOException {
		
		String configpathfile="C:\\Users\\lenovo\\eclipse-workspace\\KareCloudTest\\src\\test\\resources1\\config\\config.properties";
				
		try {
			
			props=new Properties();
			FileInputStream fis=new FileInputStream(configpathfile);
			props.load(fis);
			
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
				
		}catch(IOException e) {
			
			e.printStackTrace();
		}			
	}
	
	public static void initialization() {
		
			String browsername = props.getProperty("Browser");
			System.out.println(browsername);
			if(browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				}else if (browsername.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.get(props.getProperty("url"));
			
			
		
	}
	
	/*public void ActionsFunction(WebElement ele1,WebElement ele2) {
		
		Actions action=new Actions(driver);
		action.moveToElement(ele1).click().build().perform();
		action.moveToElement(ele2).click().build().perform();
	}*/
	
     public static void main(String[] args) {
	
}
	
	

}
