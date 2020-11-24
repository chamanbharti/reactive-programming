package spring5.annotations.part1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class HelloWorldTest {

	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        HelloWorld bean = context.getBean("helloWorld",HelloWorld.class);
//        bean.sayHello("Spring 5");
		
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldImpl",HelloWorldImpl.class);
        bean.sayHello("Spring 5");
        context.close();
		
        
	}
}
/*
That’s it. For XML based configuration, above main class can be written as follows:

spring5.annotations.part1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring5.annotations.part1.HelloWorld;

public class AppMain {

   public static void main(String args[]) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
       HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
       bean.sayHello("Spring 4");
       context.close();

   }

}
helloworld-config.xml is the file 
we discussed in step 3 created somewhere in project classpath (/src/main/resources e.g).
        
*/
