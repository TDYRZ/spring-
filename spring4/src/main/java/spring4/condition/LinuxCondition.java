package spring4.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * �ж�linux����
 * @author yrz
 *
 */
public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
