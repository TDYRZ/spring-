package spring4.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * 计划任务执行类
 * @author yrz
 *
 */
@Service
public class ScheduleTaskService {
	private static final SimpleDateFormat simpledataformat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)//声明该方法是计划任务，fixedRate每隔固定时间执行
	public void reportCurrentTime() {
		System.out.println("每隔5秒执行一次"+simpledataformat.format(new Date()));
	}
	
	@Scheduled(cron="0 54 17 ? * *")//按照指定时间执行
	public void fixTimeExecution() {
		System.out.println("在指定时间："+simpledataformat.format(new Date())+"执行");
	}
}
