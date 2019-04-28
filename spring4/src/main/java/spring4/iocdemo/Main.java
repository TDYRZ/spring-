package spring4.iocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//����������ص�������
		UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);//�������л�ȡָ����bean
		System.out.println(useFunctionService.sayHello("java"));
		context.close();
	}
}
