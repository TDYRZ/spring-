package spring4.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * �����ļ���ע��ÿ��bean
 * @author yrz
 *
 */
@Configuration//��������һ��������
public class JavaConfig {
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean 
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
}
