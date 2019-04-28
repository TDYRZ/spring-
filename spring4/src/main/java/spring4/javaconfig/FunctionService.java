package spring4.javaconfig;

import org.springframework.stereotype.Service;
/**
 * 功能类bean,不使用注解
 * @author yrz
 * 
 */
public class FunctionService {
	public String sayHello(String word) {
		return " Hello " +  word + " ! ";
	}
}
