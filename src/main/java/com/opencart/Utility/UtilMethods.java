package com.opencart.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.opencart.TestBase.TestBase;

public class UtilMethods extends TestBase {

	public static void captureScreenshot(String filename) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\workspace\\Opencart2024\\screenshots\\test" + filename + ".png");
			FileHandler.copy(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



