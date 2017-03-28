import org.openqa.selenium.chrome.ChromeDriver;

public class STAR_TC_Inbox_038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://207.20.41.72/STAR-Polaris-QA-Reports/Login.aspx");
		dr.findElementById("cntMain_txtusername").sendKeys("admin");
		dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
		dr.findElementById("cntMain_btnLogin").click();
		dr.findElementByXPath("//*[@id='cssmenu']/ul/li[1]/a").click();
		dr.findElementById("txtActivityId").sendKeys("AMOGH");

	}

}
