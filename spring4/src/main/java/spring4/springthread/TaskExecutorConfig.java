package spring4.springthread;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * 配置类
 * @author yrz
 *
 */
@Configuration
@ComponentScan("spring4.springthread")
@EnableAsync//开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//线程池大小
		taskExecutor.setMaxPoolSize(10);//最大线程池大小
		taskExecutor.setQueueCapacity(25);//队列容量
		taskExecutor.initialize();//初始化
		return taskExecutor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
