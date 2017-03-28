import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterfaceProviderToStar {
	private static final String FILENAME = "C://Users/akuduvalli/Desktop/GCP Spreadsheet/STAR_extract-20160000000001.txt";

	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		FileReader fr = null;
		int counter = 0;
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String[] input=null;
			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				if(counter==1)
				{
					//System.out.println(sCurrentLine);
					input = sCurrentLine.split("\\|");
				}
				counter++;
			}
			String sourceSystemInput = input[0];
	        String statusInput = input[1];
	        String originalBatchIdInput = input[2];
	        String prizmaBatchIdInput = input[3];
	        String providerLineInput = input[4];
	        String ext_SourceInput = input[5];
	        String ext_Activity_IdInput = input[6];
	        String activityTypeInput = input[7];
	        String activityNameInput = input[8];
	        String activityStartDateInput = input[9];
	        String activityEndDateInput = input[10];
	        String productInput = input[11];
	        String activityCountryInput = input[16];
	        String stateOrProvinceInput = input[17];
	        String activityCityInput = input[18];
	        String employeeContactInput = input[19];
	        String paymentEntityInput = input[20];
	        String thirdPartyNameInput = input[21];
	        String commentsInput = input[22];
	        String venueInput = input[23];
	        String PRIZMAIdInput = input[24];
	        String expenseOrContractInput = input[25];
	        String customerRoleInput = input[26];
	        
	        String contractIdInput = input[27];
	        String contractPurposeInput = input[28];
	        String contractDescriptionInput = input[29];
	        String contractSignatureDateInput = input[30];
	        String contractStartDateInput = input[31];
	        String contractEndDateInput = input[32];
	        String expenseTypeInput = input[33];
	        String expenseDescriptionInput = input[34];
	        String vatAmountInput = input[35];
	        
	        String expenseAmountInput = input[36];
	        String paymentDateInput = input[37];
	        String expenseCurrencyInput = input[38];
	        System.out.print("Input:"+sourceSystemInput+"|"+statusInput+"|"+originalBatchIdInput+"|"+prizmaBatchIdInput+"|"+providerLineInput+"|"+ext_SourceInput+"|"+ext_Activity_IdInput+"|"+activityTypeInput+"|"+activityNameInput+"|"+activityStartDateInput+"|"+activityEndDateInput+"|"+productInput+"|"+activityCountryInput+
	        		"|"+stateOrProvinceInput+"|"+activityCityInput+"|"+employeeContactInput+"|"+paymentEntityInput+"|"+thirdPartyNameInput+"|"+commentsInput+
	        		"|"+venueInput+"|"+PRIZMAIdInput+"|"+expenseOrContractInput+"|"+customerRoleInput+"|"+contractIdInput+"|"+"|"+contractPurposeInput+
	        		"|"+contractDescriptionInput+"|"+contractSignatureDateInput+"|"+contractStartDateInput+"|"+contractEndDateInput+"|"+expenseTypeInput+"|"+expenseDescriptionInput+
	        		"|"+vatAmountInput+"|"+"|"+expenseAmountInput+"|"+paymentDateInput+"|"+expenseCurrencyInput);
	        System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver.exe");
			ChromeDriver dr = new ChromeDriver();
			dr.get("http://207.20.41.72/STAR-Polaris-QA/Login.aspx");
			dr.manage().window().maximize();
	        dr.findElementById("cntMain_txtusername").sendKeys("admin");
	        dr.findElementById("cntMain_txtpassword").sendKeys("Polaris123!");
	        dr.findElementById("cntMain_btnLogin").click();
	        dr.findElementById("cntMain_HyperLink1").click();
	        dr.findElementById("txtActivityName").sendKeys("New Activity");
	        dr.findElementById("cntMain_btnSearch").click();
	        dr.findElementById("cntMain_grdActivities_lbtnEvenId_0").click();
	        Thread.sleep(3000);
	        String sourceSystem = "";
	        String status = "";
	        String originalBatchId = "";
	        String prizmaBatchId = "";
	        String providerLine = "";
	        String ext_Source = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblExternalSource").getText().trim();
	        String ext_Activity_Id = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblExternalActivityId").getText().trim();
	        String activityType = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lbltype").getText().trim();
	        String activityName = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblActivityName").getText().trim();
	        String activityStartDate = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lbl_EventStartDate").getText().trim();
	        String activityEndDate = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lbl_EventEndDate").getText().trim();
	        String product = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblProductName").getText().trim();
	        String activityCountry = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lbl_Country").getText().trim();
	        String stateOrProvince = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lbl_State").getText().trim();
	        String activityCity = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblCityValue").getText().trim();
	        String employeeContact = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblEmployee_Contacts").getText().trim();
	        String paymentEntity = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblPayment_Entitys").getText().trim();
	        String thirdPartyName = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblNameofThirdPartyOrganizers").getText().trim();
	        String comments = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblComment").getText().trim();
	        String venue = dr.findElementById("cntMain_UC_ActivityOverview_Summary1_lblVenues").getText().trim();
	        String PRIZMAId = "";
	        String expenseOrContract = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_ExpenseorContracts").getText().trim();
	        String customerRole = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lblhcpval").getText().trim();
	        
	        String contractId = "";
	        String contractPurpose = "";
	        String contractDescription = "";
	        String contractSignatureDate = "";
	        String contractStartDate = "";
	        String contractEndDate = "";
	        if(expenseOrContract.equals("Contract"))
	        {
	        	 contractId = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_ContractIds").getText().trim();
	             contractPurpose = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_AgreementPurposes").getText().trim();
	             contractDescription = "";
	             contractSignatureDate = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_SignatureDates").getText().trim();
	             contractStartDate = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_Contract_StartDates").getText().trim();
	             contractEndDate = dr.findElementById("cntMain_UC_RecipientsAndExpenses_lbl_Contract_EndDates").getText().trim();;
	        }
	        String expenseType = dr.findElementById("cntMain_UC_RecipientsAndExpenses_grdExp_lblSpendItemName_0").getText().trim();
	        String expenseDescription = dr.findElementById("cntMain_UC_RecipientsAndExpenses_grdExp_lblExpenseDesc_0").getText().trim();
	        String vatAmount = dr.findElementById("cntMain_UC_RecipientsAndExpenses_grdExp_lblVAT_0").getText().trim();
	        String[] expenseAmountCurrency = dr.findElementById("cntMain_UC_RecipientsAndExpenses_grdExp_lblAmount_0").getText().split(" ");
	        String paymentDate = dr.findElementById("cntMain_UC_RecipientsAndExpenses_grdExp_lblPaymentDate_0").getText().trim();
	        String expenseAmount = expenseAmountCurrency[1];
	        String expenseCurrency = expenseAmountCurrency[0];
	        System.out.println("Output:"+sourceSystem+"|"+status+"|"+originalBatchId+"|"+prizmaBatchId+"|"+providerLine+"|"+ext_Source+"|"+ext_Activity_Id+"|"+activityType+"|"+activityName+"|"+activityStartDate+"|"+activityEndDate+"|"+product+"|"+activityCountry+
            		"|"+stateOrProvince+"|"+activityCity+"|"+employeeContact+"|"+paymentEntity+"|"+thirdPartyName+"|"+comments+
            		"|"+venue+"|"+PRIZMAId+"|"+expenseOrContract+"|"+customerRole+"|"+contractId+"|"+contractPurpose+
            		"|"+contractDescription+"|"+contractSignatureDate+"|"+contractStartDate+"|"+contractEndDate+"|"+expenseType+"|"+expenseDescription+
            		"|"+vatAmount+"|"+expenseAmount+"|"+paymentDate+"|"+expenseCurrency);
	        try(
					Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C://Users/akuduvalli/Desktop/GCP Spreadsheet/dataOutput.txt"), "utf-8"))){
	        
	                writer.write(sourceSystem+"|"+status+"|"+originalBatchId+"|"+prizmaBatchId+"|"+providerLine+"|"+ext_Source+"|"+ext_Activity_Id+"|"+activityType+"|"+activityName+"|"+activityStartDate+"|"+activityEndDate+"|"+product+"|"+activityCountry+
	                		"|"+stateOrProvince+"|"+activityCity+"|"+employeeContact+"|"+paymentEntity+"|"+thirdPartyName+"|"+comments+
	                		"|"+venue+"|"+PRIZMAId+"|"+expenseOrContract+"|"+customerRole+"|"+contractId+"|"+contractPurpose+
	                		"|"+contractDescription+"|"+contractSignatureDate+"|"+contractStartDate+"|"+contractEndDate+"|"+expenseType+"|"+expenseDescription+
	                		"|"+vatAmount+"|"+expenseAmount+"|"+paymentDate+"|"+expenseCurrency);
	        }
	        finally
	        {
	        System.out.print(sourceSystem.equalsIgnoreCase(sourceSystemInput)+"|"+status.equalsIgnoreCase(statusInput)+"|"+originalBatchId.equalsIgnoreCase(originalBatchIdInput)+"|"+prizmaBatchId.equalsIgnoreCase(prizmaBatchIdInput)+"|"+providerLine.equalsIgnoreCase(providerLineInput)+"|"+ext_Source.equalsIgnoreCase(ext_SourceInput)+"|"+ext_Activity_Id.equalsIgnoreCase(ext_Activity_IdInput)+
	        		"|"+activityType.equalsIgnoreCase(activityTypeInput)+"|"+activityName.equalsIgnoreCase(activityNameInput)+"|"+activityStartDate.equalsIgnoreCase(activityStartDateInput)+"|"+activityEndDate.equalsIgnoreCase(activityEndDateInput)+"|"+product.equalsIgnoreCase(productInput)+"|"+activityCountry.equalsIgnoreCase(activityCountryInput)+
            		"|"+stateOrProvince.equalsIgnoreCase(stateOrProvinceInput)+"|"+activityCity.equalsIgnoreCase(activityCityInput)+"|"+employeeContact.equalsIgnoreCase(employeeContactInput)+"|"+paymentEntity.equalsIgnoreCase(paymentEntityInput)+"|"+thirdPartyName.equalsIgnoreCase(thirdPartyNameInput)+"|"+comments.equalsIgnoreCase(commentsInput)+
            		"|"+venue.equalsIgnoreCase(venueInput)+"|"+PRIZMAId.equalsIgnoreCase(PRIZMAIdInput)+"|"+expenseOrContract.equalsIgnoreCase(expenseOrContractInput)+"|"+customerRole.equalsIgnoreCase(customerRoleInput)+"|"+contractId.equalsIgnoreCase(contractIdInput)+"|"+contractPurpose.equalsIgnoreCase(contractPurposeInput)+
            		"|"+contractDescription.equalsIgnoreCase(contractDescriptionInput)+"|"+contractSignatureDate.equalsIgnoreCase(contractSignatureDateInput)+"|"+contractStartDate.equalsIgnoreCase(contractStartDateInput)+"|"+contractEndDate.equalsIgnoreCase(contractEndDateInput)+"|"+expenseType.equalsIgnoreCase(expenseTypeInput)+"|"+expenseDescription.equalsIgnoreCase(expenseDescriptionInput)+
            		"|"+vatAmount.equalsIgnoreCase(vatAmountInput)+"|"+expenseAmount.equalsIgnoreCase(expenseAmountInput)+"|"+paymentDate.equalsIgnoreCase(paymentDateInput)+"|"+expenseCurrency.equalsIgnoreCase(expenseCurrencyInput));
	        }

		} catch (IOException e) {

			e.printStackTrace();

		} 
		
	}

}
