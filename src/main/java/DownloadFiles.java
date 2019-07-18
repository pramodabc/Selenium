import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFiles {

	public static void main(String[] args) 
	{
		
		File folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		
		ChromeOptions options=new ChromeOptions();
		
		Map<String, Object> prefs=new HashMap();
		
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver=new ChromeDriver(cap);
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[25]/a")).click();
		
		
		
		
		
		
	}

}
   
