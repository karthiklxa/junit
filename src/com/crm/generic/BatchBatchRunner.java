package com.crm.generic;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BatchBatchRunner
{

	public static void main(String[] args)
	{
		Result res=JUnitCore.runClasses(Runner.class);
		int noTestExec = res.getRunCount();
		int noFail=res.getFailureCount();
		System.out.println("executed----->"+noTestExec);
		System.out.println("failed------>"+noFail);
		
		System.out.println("....failed test results....");
		List<Failure> listFailures = res.getFailures();
		for(Failure f:listFailures)
		{
			System.out.println(f.getTrace());
			System.out.println(f.getDescription());
		}
	}

}
