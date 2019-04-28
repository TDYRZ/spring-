package spring4.springthread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);//����������ص�������
		AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);//�������л�ȡָ����bean
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		
		context.close();
	}
}
