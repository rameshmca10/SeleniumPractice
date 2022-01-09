package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {
	int count = 0;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count < 1) {
			count++;
			return true;
		}

		return false;
	}

}