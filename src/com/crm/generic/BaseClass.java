package com.crm.generic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseClass
{

	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("launch the  browser ---beforeclass");
	}
	@Before
	public void loginApp()
	{
		System.out.println("login----before method");
	}
	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("close browser------after class");
	}
	@After
	public void logoutApp()
	{
		System.out.println("logout-----after method");
	}
	
}
