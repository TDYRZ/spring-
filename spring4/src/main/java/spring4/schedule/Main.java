package spring4.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.springthread.AsyncTaskService;
import spring4.springthread.TaskExecutorConfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);//将配置类加载到容器中
	}
}
