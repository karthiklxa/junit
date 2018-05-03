package com.crm.module_2;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.crm.generic.BaseClass;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountTest extends BaseClass
{
	
	@Test
	public void b_testAccount()
	{
		System.out.println("execute account test-------3 ");
		//Assert.assertEquals("A", "B");
	}
	@Test
	public void a_testModifyAccount()
	{
		System.out.println("modify account test ------4 ");
	}
	
	
}
