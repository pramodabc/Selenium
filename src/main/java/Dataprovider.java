import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{

	@Test(dataProvider="timepass")
	public void test(String un,String pass)
	{
		/*
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		*/
		
		String a="Pramod";
		String b="Patil";
		
		if(a.equals(un)&&b.equals(pass))
		{
			System.out.println("logon successfully");
		}
		else 
		{
			System.out.println("user are u drunk plzz checkk ur un and pass");
		}
		Assert.assertTrue(a.equals(un)&&b.equals(pass));
		
		
	}
	
	
	
	@DataProvider(name="timepass")
	
	public Object[][] data()
	{
		Object[][] getdata=new Object[3][2];
		
		getdata[0][0]="ramod";
		getdata[0][1]="Patil";
		
		getdata[1][0]="abc";
		getdata[1][1]="pqr";
		
		getdata[2][0]="zxc";
		getdata[2][1]="ooo";
		
		
		return getdata;
		
	}
}
