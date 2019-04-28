package spring4.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring4.aopdemo.AopConfig;
import spring4.aopdemo.DemoAnnotionService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);// ����������ص�������
		ListService listService = context.getBean(ListService.class);// �������л�ȡָ����bean
		System.out.println(context.getEnvironment().getProperty("os.name")+"ϵͳ�µ��б�����:"+listService.showListCmd());
	}
}
