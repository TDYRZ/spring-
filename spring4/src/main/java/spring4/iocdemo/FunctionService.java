package spring4.iocdemo;

import org.springframework.stereotype.Service;
/**
 * ������bean
 * @author yrz
 *@service����ע��bean
 */
@Service
public class FunctionService {
	public String sayHello(String word) {
		return " Hello " +  word + " ! ";
	}
}
