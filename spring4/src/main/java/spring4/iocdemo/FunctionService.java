package spring4.iocdemo;

import org.springframework.stereotype.Service;
/**
 * 功能类bean
 * @author yrz
 *@service用于注入bean
 */
@Service
public class FunctionService {
	public String sayHello(String word) {
		return " Hello " +  word + " ! ";
	}
}
