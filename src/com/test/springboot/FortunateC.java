package com.test.springboot;

import org.springframework.stereotype.Component;

@Component
public class FortunateC implements FortunateServices {

	@Override
	public String doLucky() {
		// TODO Auto-generated method stub
		return "C......";
	}

}
