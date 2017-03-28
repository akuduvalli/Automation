import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @BeforeMethod
   public void preTest()
   {
	   System.out.println("This is the first message");
   }

   @Test(priority=1)
   public void testPrintMessage() {	
	   Assert.assertTrue(5<3);
   }
   
   @Test(priority=0)
   public void testAnotherPrintMessage() {	
	   String message = "Hello World";
      Assert.assertEquals(message,messageUtil.printMessage());
   }
   
   @AfterMethod
   public void postTest()
   {
	   System.out.println("Everything is fine");
   }
}