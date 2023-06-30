package com.afishing.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.afishing.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
