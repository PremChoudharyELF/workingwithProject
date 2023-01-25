package makeMyTripAssignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithDependsOn {
     @Test(dependsOnMethods = "register")
	public void createAccount() {
		Reporter.log("From create account",true);
	}
     @Test(dependsOnMethods = {"createAccount","register"})
	public void modifyAccount() {
		
		Reporter.log("From modify account",true);
	}
     @Test
     public void register() {
    	 Reporter.log("From register",true);
     }
     @Test(dependsOnMethods = "createAccount")
     public void amountTransfer() {
    	 Reporter.log("From amount transfer",true);
     }
     @Test(dependsOnMethods = {"createAccount","modifyAccount"})
     public void deleteAccount() {
    	 Reporter.log("From delete account",true);
     }
}
