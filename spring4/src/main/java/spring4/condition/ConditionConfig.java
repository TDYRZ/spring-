package spring4.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)//����windows������ʵ����
	public WindowsListService windowsListService() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public LinuxListService linuxListService() {
		return new LinuxListService();
	}
}
