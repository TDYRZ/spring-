package spring4.iocdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这是一个配置类
@ComponentScan("spring4")//自动扫描包下@Service,@Component,@Repository,@Controller,并注册为bean
public class Config {
	
}
