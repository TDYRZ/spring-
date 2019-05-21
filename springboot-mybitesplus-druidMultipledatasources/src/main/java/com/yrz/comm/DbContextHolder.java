package com.yrz.comm;


/**
 * 
 * @author yrz
 *
 */
public class DbContextHolder {
	//使用线程局部变量，保证数据源在方法和类之间中共享，在线程间隔离
	 private static final ThreadLocal contextHolder = new ThreadLocal<>();
	 
	  /**
	     * 设置数据源
	     * @param dbTypeEnum
	     */
	    public static void setDbType(DBTypeEnum dbTypeEnum) {
	        contextHolder.set(dbTypeEnum.getValue());
	    }
	    
	    /**
	     * 取得当前数据源
	     * @return
	     */
	    public static String getDbType() {
	        return (String) contextHolder.get();
	    }
	    
	    /**
	     * 清除上下文数据
	     */
	    public static void clearDbType() {
	        contextHolder.remove();
	    }

}
