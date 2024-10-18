package com.cdac.act.classes;

import java.util.concurrent.Callable;

public class SumofNumbersCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		String threadName = Thread.currentThread().getName();
		int sum = 0;
		int n;
		System.out.println(threadName + "Starded");
		for(int i = 0; i < 100; i++)
		{
			sum += i;
			
		}
		return threadName;
	}




}
