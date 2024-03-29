import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickSearchActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://207.20.41.72/STAR-Polaris-4.3.0-QA/");
		dr.manage().window().maximize();
        dr.findElementById("cntMain_txtusername").sendKeys("admin");
        dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
        dr.findElementById("cntMain_btnLogin").click();
        dr.findElementById("txtActivityId").sendKeys("459");
        dr.findElementById("cntMain_ddlActivityType_chosen").click();
        dr.findElementByXPath("//*[@id='cntMain_ddlActivityType_chosen']/div/ul/li[2]").click();
        dr.findElementById("cntMain_ddlCountry_chosen").click();
        dr.findElementByXPath("//*[@id='cntMain_ddlCountry_chosen']/div/ul/li[234]").click();
        dr.findElementById("cntMain_ddlStatus_chosen").click();
        dr.findElementByXPath("//*[@id='cntMain_ddlStatus_chosen']/div/ul/li[2]").click();
        dr.findElementById("ddlPaymentEntity_chosen").click();
        dr.findElementByXPath("//*[@id='ddlPaymentEntity_chosen']/div/ul/li[5]").click();
        dr.findElementById("cntMain_btn_Search").click();
        int rowCount=dr.findElements(By.xpath("//table[@id='cntMain_grdActivities']/tbody/tr")).size();
        if(rowCount>1)
        {
        	String parent = dr.getWindowHandle();
        	dr.findElementById("cntMain_grdActivities_ibtnEditRecipient_0").click();
        	
        	 dr.switchTo().activeElement();
        	 Thread.sleep(3000);
        	dr.findElementByClassName("btn-close-modal").click();
        	dr.switchTo().window(parent);
        }
        else
        {
        	System.out.println("No Results found");
        }
        dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        dr.findElementById("cntActionLinks_lblusername").click();
        dr.findElementById("cntActionLinks_btnLogout").click();
        dr.quit();
        
	}

}
