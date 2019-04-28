package spring4.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring4.aopdemo")
@EnableAspectJAutoProxy//开启spring对Aspect的支持
public class AopConfig {
	
}
