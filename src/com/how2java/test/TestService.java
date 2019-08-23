package com.how2java.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.how2java.service.TestInterface;
import com.how2java.service.impl.TestInterfaceImpl;

@Component
public class TestService {
	@Autowired
	public TestInterface testInterface;

	public void dos() {
		testInterface.show();
	}

}
