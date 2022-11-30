package com.demoblaze.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demoblaze.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		logger.info("Test case execution started: "+result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		logger.info("Test case execution completed successfully: "+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		logger.info("Test case execution failed: "+result.getName());
		CommonMethods.screenshot(result.getName());
		System.out.println("Screenshot taken");
	}
	public void onTestSkipped(ITestResult result)
	{
		logger.info("Test case execution skipped: "+result.getName());
	}	
}
