package com.investaSolutions.tests;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;
public class RunnableTestClass {
	
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();	
		suites.add("C:\\Users\\dheeraj.singh\\git\\JavaFrameWork2\\InvFrameworkDemo\\testng.xml");//path to xml..in src
		//PropertiesManager.getInstance().ConfigFile();
		//PropertiesManager.getInstance().ConstantsFile();
		//PropertiesManager.getInstance().LogMessagesFile();
		testng.setTestSuites(suites);
		testng.run();
	}

}
