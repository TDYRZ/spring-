package spring4.aopdemo;

import java.lang.annotation.*;

/**
 * ��д���ع����ע��
 * @author Administrator
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action{
	String name();
}
