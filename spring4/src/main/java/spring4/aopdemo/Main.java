package spring4.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.iocdemo.Config;
import spring4.iocdemo.UseFunctionService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);// 将配置类加载到容器中
		DemoAnnotionService demoAnnotionService = context.getBean(DemoAnnotionService.class);// 在容器中获取指定的bean
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);// 在容器中获取指定的bean

		demoAnnotionService.add();
		demoMethodService.add();
		context.close();
	}

}
