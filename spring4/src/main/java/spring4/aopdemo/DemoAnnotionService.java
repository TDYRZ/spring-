package spring4.aopdemo;

import org.springframework.stereotype.Service;
/**
 * 使用注解的被拦截类
 * @author yrz
 *
 */
@Service
public class DemoAnnotionService {
	@Action(name="注解式拦截的add操作")
	public void add() {}
}
