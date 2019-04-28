package spring4.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 使用功能类，不使用注解
 * @author yrz
 *
 */
public class UseFunctionService {
	
	FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

	/**
	 * 使用set方法注入其他bean
	* @Title: setFunctionService 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param functionService 设定文件 
	* @author:yrz
	* @data: 2019年4月23日 下午6:05:47 
	* @return void 返回类型 
	* @throws
	 */
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	
}
