package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		String ExpectedMonth="August 2019";
		String date="20";
		String SelectedMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(SelectedMonth);
		
	    WebElement element=	driver.findElement(By.xpath("//a[@title='Next']"));
	    
	    if(SelectedMonth.equals(ExpectedMonth))
	    {
	    	System.out.println("Month Already Selected");
	    }
	    else 
	    {
	    	for(int i=1;i<12;i++)
	    	{
	    		element.click();
	    		
	    		SelectedMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	    		System.out.println(SelectedMonth);
	    		
	    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    		if(SelectedMonth.equals(ExpectedMonth))
	    		{
	    			System.out.println("Month Selected");
	    			break;
	    		}
	    		
	    		
	    		
	    	}
	    }
	

	  List<WebElement> list= driver.findElements(By.xpath("//td//a[@class='ui-state-default']"));
	  for (WebElement singlelist : list) 
	  {
		//System.out.println(singlelist.getText());
	
		  String listdate=	  singlelist.getText();
		  if(date.equals(listdate))
		  {
			  singlelist.click();
			  break;
		  }
	}
	}

}
