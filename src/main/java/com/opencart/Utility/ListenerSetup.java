package com.opencart.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.testng.*;

public class ListenerSetup implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Testcase execution is started :- " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution is completed :- " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase execution is failed :- " + result.getName());
		UtilMethods.captureScreenshot(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase execution is skipped :- " + result.getName());
	}

	// -------------------------------------------------------------------

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}