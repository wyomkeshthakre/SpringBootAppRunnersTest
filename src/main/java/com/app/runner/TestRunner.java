package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("from Runner");
		System.out.println("args");
		System.out.println(Arrays.asList(args));
	}

}
