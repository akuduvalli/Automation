import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		/*Using recent STAR*/
		dr.get("http://207.20.41.72/STAR-Polaris-4.3.0-QA/");
		dr.manage().window().maximize();
        dr.findElementById("cntMain_txtusername").sendKeys("admin");
        dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
        dr.findElementById("cntMain_btnLogin").click();
        dr.findElementById("cntActionLinks_lblReports").click();
        dr.findElementById("cntActionLinks_liReportManagement").click();
        WebElement countryDropdown = dr.findElementById("cntMain_ddlCountry_chosen");
        countryDropdown.click();
        WebElement countrySelected = dr.findElementByXPath("//*[@id='cntMain_ddlCountry_chosen']/div/ul/li[4]");
        countrySelected.click();
        dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement reportNameDropdown = dr.findElementById("cntMain_ddlReportName_chosen");
        reportNameDropdown.click();
        WebElement reportSelected = dr.findElementByXPath("//*[@id='cntMain_ddlReportName_chosen']/div/ul/li[7]");
        reportSelected.click();
        WebElement reportTypeDropdown = dr.findElementById("cntMain_ddlReportType_chosen");
        reportTypeDropdown.click();
        WebElement reportTypeSelected = dr.findElementByXPath("//*[@id='cntMain_ddlReportType_chosen']/div/ul/li[2]");
        reportTypeSelected.click();
        WebElement reportStatusDropdown = dr.findElementById("cntMain_ddlReportStaus_chosen");
        reportStatusDropdown.click();
        WebElement reportStatusSelected = dr.findElementByXPath("//*[@id='cntMain_ddlReportStaus_chosen']/div/ul/li[2]");
        reportStatusSelected.click();
        WebElement reportPeriodDropdown = dr.findElementById("cntMain_ddlReportPeriod_chosen");
        reportPeriodDropdown.click();
        WebElement reportPeriodSelected = dr.findElementByXPath("//*[@id='cntMain_ddlReportPeriod_chosen']/div/ul/li[3]");
        reportPeriodSelected.click();
        WebElement searchButton = dr.findElementById("cntMain_btn_Search");
        searchButton.click();
        dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        int rowCount = dr.findElements(By.xpath("//table[@id='cntMain_grdReportMant']/tbody/tr")).size();
        if(rowCount > 1)
        {
        	/*dr.findElementById("cntMain_grdReportMant_imgBtnComments_0").click();
        	dr.findElementById("cntMain_grdReportMant_txtComments_0").sendKeys("Save this comment");
        	dr.findElementById("cntMain_grdReportMant_btnSaveComments_0").click();*/
        	dr.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        	WebElement downloadReport = dr.findElementById("cntMain_grdReportMant_lbViewReport_0");
        	downloadReport.click();
        }
        else
        {
        	System.out.println("No Results Found !");
        }
        /*dr.findElementById("cntActionLinks_lblusername").click();
        dr.findElementById("cntActionLinks_btnLogout").click();
        dr.quit();*/
        
	}

}
