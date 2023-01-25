package WorkingWithScreenShotsOfFailedTestCase;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ItestListnerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenShot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
		//result.getTestContext().getName()-for test name in xml
	}

	
}
