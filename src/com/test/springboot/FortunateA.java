package com.test.springboot;

import org.springframework.stereotype.Component;

@Component
public class FortunateA implements FortunateServices {
	private String[] data = {"1","2","3","4"};
	@Override
	public String doLucky() {
		
		return data[(int) Math.ceil(Math.random()*3)];
	}

}
