package com.how2java.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.how2java.service.TestInterface;

@Service
public class TestInterfaceImpl implements TestInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello interface");
	}

	
}
