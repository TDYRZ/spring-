package spring4.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * �ƻ�����ִ����
 * @author yrz
 *
 */
@Service
public class ScheduleTaskService {
	private static final SimpleDateFormat simpledataformat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)//�����÷����Ǽƻ�����fixedRateÿ���̶�ʱ��ִ��
	public void reportCurrentTime() {
		System.out.println("ÿ��5��ִ��һ��"+simpledataformat.format(new Date()));
	}
	
	@Scheduled(cron="0 54 17 ? * *")//����ָ��ʱ��ִ��
	public void fixTimeExecution() {
		System.out.println("��ָ��ʱ�䣺"+simpledataformat.format(new Date())+"ִ��");
	}
}
