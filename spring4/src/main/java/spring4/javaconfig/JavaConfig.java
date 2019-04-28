package spring4.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 配置文件中注入每个bean
 * @author yrz
 *
 */
@Configuration//声明它是一个配置类
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
