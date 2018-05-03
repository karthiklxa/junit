package com.crm.generic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.crm.module_1.ContactTest;
import com.crm.module_2.AccountTest;

@RunWith(Suite.class)
@SuiteClasses({ContactTest.class,AccountTest.class})
public class Runner
{
	
}
