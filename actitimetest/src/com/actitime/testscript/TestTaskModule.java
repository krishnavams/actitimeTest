package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.BaseClass;
@Listeners(com.actitime.genaric.ListenerImplementation.class)
public class TestTaskModule extends BaseClass {
	@Test
	public void testCreateCustomer() {
		
	}
}
