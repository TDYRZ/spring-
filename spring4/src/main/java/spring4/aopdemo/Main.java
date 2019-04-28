package spring4.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.iocdemo.Config;
import spring4.iocdemo.UseFunctionService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);// ����������ص�������
		DemoAnnotionService demoAnnotionService = context.getBean(DemoAnnotionService.class);// �������л�ȡָ����bean
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);// �������л�ȡָ����bean

		demoAnnotionService.add();
		demoMethodService.add();
		context.close();
	}

}
