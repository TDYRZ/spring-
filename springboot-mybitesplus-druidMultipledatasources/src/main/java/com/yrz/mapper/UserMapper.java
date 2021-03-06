package com.yrz.mapper;
 
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yrz.model.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yrz
 */
public interface UserMapper extends BaseMapper<User> {
	 @Select("SELECT * from user where name=#{name}")
     User getUserByName(String name);
}
