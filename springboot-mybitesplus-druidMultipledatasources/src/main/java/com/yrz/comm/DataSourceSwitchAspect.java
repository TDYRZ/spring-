package com.yrz.comm;

import java.util.Objects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class DataSourceSwitchAspect {

    @Pointcut("execution(* com.yrz.service.db1.*.*(..))")
    private void db1Aspect() {
    }

    @Pointcut("execution(* com.yrz.service.db2.*.*(..))")
    private void db2Aspect() {
    }
    
    /**
     * 执行service方法之前先切换数据源到db1
    * @Title: db1 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param joinPoint 设定文件 
    * @author:yrz
    * @data: 2019年5月21日 下午4:48:06 
    * @return void 返回类型 
    * @throws
     */
    @Before( "db1Aspect()" )
    public void db1(JoinPoint joinPoint) {
       System.out.println("切换到db1 数据源...");
        setDataSource(joinPoint,DBTypeEnum.db1);
    }
    
    /**
     * 执行service方法之前先切换数据源到db2
    * @Title: db1 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param joinPoint 设定文件 
    * @author:yrz
    * @data: 2019年5月21日 下午4:48:06 
    * @return void 返回类型 
    * @throws
     */
    @Before("db2Aspect()" )
    public void db2 (JoinPoint joinPoint) {
        System.out.println("切换到db2 数据源...");
        setDataSource(joinPoint,DBTypeEnum.db2);
    }
    /**
     * 添加注解方式,如果有注解优先注解,没有则按传过来的数据源配置
     * @param joinPoint
     * @param dbTypeEnum
     */
    private void setDataSource(JoinPoint joinPoint, DBTypeEnum dbTypeEnum) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        DataSourceSwitch dataSourceSwitch = methodSignature.getMethod().getAnnotation(DataSourceSwitch.class);
        if (Objects.isNull(dataSourceSwitch) || Objects.isNull(dataSourceSwitch.value())) {
            DbContextHolder.setDbType(dbTypeEnum);
        }else{
            System.out.println("根据注解来切换数据源,注解值为:"+dataSourceSwitch.value());
            switch (dataSourceSwitch.value().getValue()) {
                case "db1":
                    DbContextHolder.setDbType(DBTypeEnum.db1);
                    break;
                case "db2":
                    DbContextHolder.setDbType(DBTypeEnum.db2);
                    break;
                default:
                    DbContextHolder.setDbType(dbTypeEnum);
            }
        }
    }
}
