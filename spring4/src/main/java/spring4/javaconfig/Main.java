package spring4.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.iocdemo.Config;
import spring4.iocdemo.UseFunctionService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//将配置类加载到容器中
		UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);//在容器中获取指定的bean
		System.out.println(useFunctionService.sayHello("java"));
		context.close();
	}
}
