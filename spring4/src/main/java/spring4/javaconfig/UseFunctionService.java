package spring4.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ʹ�ù����࣬��ʹ��ע��
 * @author yrz
 *
 */
public class UseFunctionService {
	
	FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

	/**
	 * ʹ��set����ע������bean
	* @Title: setFunctionService 
	* @Description: TODO(������һ�仰�����������������) 
	* @param @param functionService �趨�ļ� 
	* @author:yrz
	* @data: 2019��4��23�� ����6:05:47 
	* @return void �������� 
	* @throws
	 */
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	
}
