package spring4.javaconfig;

import org.springframework.stereotype.Service;
/**
 * ������bean,��ʹ��ע��
 * @author yrz
 * 
 */
public class FunctionService {
	public String sayHello(String word) {
		return " Hello " +  word + " ! ";
	}
}
