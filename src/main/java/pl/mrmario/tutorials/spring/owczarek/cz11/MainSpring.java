package pl.mrmario.tutorials.spring.owczarek.cz11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean= context.getBean("someBean", SomeBean.class);
		
		System.out.println(someBean.getLocales());
		System.out.println(someBean.getSettings());
			}
}