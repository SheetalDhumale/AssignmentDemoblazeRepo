package com.demoblaze.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.demoblaze.testBase.TestBase;

public class CommonMethods extends TestBase
{
	public static void screenshot(String filename)
	{
		try
		{
			String path = "C:\\Users\\91966\\Desktop\\Github\\AssignmentDemoblazeRepo\\DemoblazeAssignment\\Screenshot\\";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path+filename+".png"+System.currentTimeMillis());
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception - file not found");
			e.printStackTrace();
		}
	}
	 public static void scrolling(String scroll)
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript(scroll);
	 }
	 
}	