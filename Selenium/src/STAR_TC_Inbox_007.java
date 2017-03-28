import org.openqa.selenium.chrome.ChromeDriver;

public class STAR_TC_Inbox_007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver_win32/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://207.20.41.72/STAR-Polaris-QA-Reports/Login.aspx");
        dr.findElementById("cntMain_txtusername").sendKeys("admin");
        dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
        dr.findElementById("cntMain_btnLogin").click();
        dr.findElementById("cntActionLinks_lblSearch").click();
        //dr.findElementById("cntActionLinks_lblusername").click();
        //dr.findElementById("cntActionLinks_btnLogout").click();cntActionLinks_btn_Profile
	}

}
