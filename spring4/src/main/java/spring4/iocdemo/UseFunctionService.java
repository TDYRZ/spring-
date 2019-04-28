package spring4.iocdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ʹ�ù�����
 * @author yrz
 *
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
