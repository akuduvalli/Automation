import org.openqa.selenium.chrome.ChromeDriver;

public class STAR_TC_Inbox_054 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://207.20.41.72/STAR-Polaris-QA-Reports/Login.aspx");
		dr.findElementById("cntMain_txtusername").sendKeys("admin");
		dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
		dr.findElementById("cntMain_btnLogin").click();
		dr.findElementById("cntMain_btn_Search").click();
		dr.findElementByXPath("//*[@id='cntMain_grdOldEvent']/tbody/tr[1]/th[1]/a").click();
		Thread.sleep(4000);
		dr.findElementByXPath("//*[@id='cntMain_grdOldEvent']/tbody/tr[1]/th[1]/a").click();
	}

}
