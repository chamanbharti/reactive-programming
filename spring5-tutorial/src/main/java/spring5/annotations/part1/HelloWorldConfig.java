package spring5.annotations.part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan(basePackages = "spring5.annotations.part1")
public class HelloWorldConfig {

//	@Bean(name="helloWorldBean")
//    @Description("This is a sample HelloWorld Bean")
//	public HelloWorld helloWorld() {
//		return new HelloWorldImpl();
//	}
}
/*
 Above configuration is same as below Spring XML representation(let’s name it helloworld-config.xml):

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
        
  <!-- collaborators and configuration for this bean go here -->
    <bean id="helloWorldBean" class="spring5.annotations.part1.HelloWorldImpl">
  
</beans>
 */


