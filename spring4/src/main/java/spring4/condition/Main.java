package spring4.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.aopdemo.AopConfig;
import spring4.aopdemo.DemoAnnotionService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);// 将配置类加载到容器中
		ListService listService = context.getBean(ListService.class);// 在容器中获取指定的bean
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令:"+listService.showListCmd());
	}
}
