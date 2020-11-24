package spring5.annotations.part1;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
}