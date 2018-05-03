package com.crm.module_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BankAccount
{
	String accName;
	String pass;
	
	
	public BankAccount(String accName, String pass)
	{
		
		this.accName = accName;
		this.pass = pass;
	}

	@Parameters
	public static Object[][] getDate()
	{
		Object[][] objArr = new Object[4][2];
		
		objArr[0][0]="acc_1";
		objArr[0][1]="pass_1";
		
		objArr[1][0]="acc_2";
		objArr[1][1]="pass_2";
		
		objArr[2][0]="acc_3";
		objArr[2][1]="pass_3";
		
		objArr[3][0]="acc_4";
		objArr[3][1]="pass_4";
	
		return objArr;
	}
	
	@Test
	public void createAccount()
	{
		System.out.println("execute create account===>" +accName+ ",password===>"+pass);
	}
}
