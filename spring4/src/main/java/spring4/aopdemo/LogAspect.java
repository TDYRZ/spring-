package spring4.aopdemo;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * ��־ ��������
 * 
 * @author yrz
 *
 */
@Aspect // ����һ������
@Component // spring������ע��ע������bean
public class LogAspect {
	@Pointcut("@annotation(spring4.aopdemo.Action)") // �����е�
	public void annotionPointCut() {
	};

	@After("annotionPointCut()") // ����һ�����ԣ�ʹ��@PointCut������е�
	public void after(JoinPoint JoinPoint) {
		MethodSignature methodSignature = (MethodSignature) JoinPoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("ע��ʽ����:" + action.name());
	}

	@Before("execution(* spring4.aopdemo.DemoMethodService.*(. .))")
	public void before(JoinPoint JoinPoint) {
		MethodSignature methodSignature = (MethodSignature) JoinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("��������ʽ����:" + method.getName());
	}
}
