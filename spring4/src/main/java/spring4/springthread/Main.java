package spring4.springthread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);//将配置类加载到容器中
		AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);//在容器中获取指定的bean
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		
		context.close();
	}
}
