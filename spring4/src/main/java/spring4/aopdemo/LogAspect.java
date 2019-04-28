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
 * 日志 切面类生
 * 
 * @author yrz
 *
 */
@Aspect // 声明一个切面
@Component // spring容器中注入注入切面bean
public class LogAspect {
	@Pointcut("@annotation(spring4.aopdemo.Action)") // 声明切点
	public void annotionPointCut() {
	};

	@After("annotionPointCut()") // 声明一个建言，使用@PointCut定义的切点
	public void after(JoinPoint JoinPoint) {
		MethodSignature methodSignature = (MethodSignature) JoinPoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截:" + action.name());
	}

	@Before("execution(* spring4.aopdemo.DemoMethodService.*(. .))")
	public void before(JoinPoint JoinPoint) {
		MethodSignature methodSignature = (MethodSignature) JoinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("方法规则式拦截:" + method.getName());
	}
}
