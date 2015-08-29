package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import strategies.FizzBuzz.*;

public class MainApp {

	ApplicationContext context = new ClassPathXmlApplicationContext("FizzBuzz.xml");
	
	LoopStrategy fb = (LoopStrategy) context.getBean("loopStrategy");
	
}
