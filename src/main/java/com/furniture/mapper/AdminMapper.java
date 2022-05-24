package com.furniture.mapper;

import com.furniture.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author za
 * @since 2022-05-18
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}
