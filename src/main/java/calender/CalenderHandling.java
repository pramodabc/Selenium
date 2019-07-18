package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {
//WebDriver driver=null;
	public static void main(String[] args) 
	{
		
		//String SelectedMonth="August 2019";
		
		//String SelectedDate="24";
		
		//Test.verifyCredential("August 2019", "24");
		
		Test.verifyCredential("July 2019", "10");
		
		
	}

}

class Test
{
	//WebDriver driver=null;
	
	public static void verifyCredential(String SelectedMonth,String SelectedDate)
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.skyscanner.co.in");
		
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		
		
		driver.findElement(By.xpath("// div[@class='FlightDatepicker_fsc-datepicker__container__hgj24']"));
		
		   
	     
		   Select select=new Select(driver.findElement(By.name("months")));
		  // select.selectByIndex(1);
		   select.selectByVisibleText(SelectedMonth);
		   
		List<WebElement>  dates=  driver.findElements(By.xpath("//td//button[@type='button']"));
		
		for (WebElement date : dates) 
		{
		String text=	date.getText();
		System.out.println(text);
		if(text.contains(SelectedDate))
		{
			date.click();
			break;
		}
		}
		
	}
	
	
	
}
