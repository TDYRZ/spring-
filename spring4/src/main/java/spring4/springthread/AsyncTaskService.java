package spring4.springthread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * 任务执行类
 * @author yrz
 *
 */
@Service
public class AsyncTaskService {

	@Async//声明异步方法
	public void executeAsyncTask(int i) {
		System.out.println("执行异步任务"+i);
	}
	@Async
	public void executeAsyncTaskPlus(int i) {
		System.out.println("执行异步任务+1:"+(i+1));
	}
}
