package spring4.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring4.aopdemo")
@EnableAspectJAutoProxy//����spring��Aspect��֧��
public class AopConfig {
	
}
