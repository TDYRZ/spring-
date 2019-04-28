package spring4.springthread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * ����ִ����
 * @author yrz
 *
 */
@Service
public class AsyncTaskService {

	@Async//�����첽����
	public void executeAsyncTask(int i) {
		System.out.println("ִ���첽����"+i);
	}
	@Async
	public void executeAsyncTaskPlus(int i) {
		System.out.println("ִ���첽����+1:"+(i+1));
	}
}
