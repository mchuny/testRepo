package spring.di.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.hello.EnHello;
import spring.di.hello.Hello;

public class TestHello {

	Hello hello;
	public TestHello(Hello hello){
		this.hello = hello;
	}
	public void printGreeting(){
		String name = "김철수";
		String g = hello.sayHello(name);
		System.out.println(g);
	}
	
	
	public static void main(String[] args) {
		EnHello hello = new EnHello();
		//korHello hello = new korHello();
		
		//Spring container객체 생성 <- 설정파일의 위치를 알려줘야 한다.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/config/hello.xml");//spring container
		
		
		//Hello hello = (Hello)ctx.getBean("hello");
		TestHello th = new TestHello(hello);
		th.printGreeting();
		 
		
//		TestHello thello=(TestHello)ctx.getBean("testHello");
//		thello.printGreeting();
	}
}
