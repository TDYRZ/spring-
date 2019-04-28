package spring4.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.iocdemo.Config;
import spring4.iocdemo.UseFunctionService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//����������ص�������
		UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);//�������л�ȡָ����bean
		System.out.println(useFunctionService.sayHello("java"));
		context.close();
	}
}
