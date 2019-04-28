package spring4.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 配置类
 * @author yrz
 *
 */
@ComponentScan("spring4.schedule")
@Configuration
@EnableScheduling//开启对计划任务的支持
public class ScheduleConfig {

}
