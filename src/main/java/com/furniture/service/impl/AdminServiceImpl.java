package com.furniture.service.impl;

import com.furniture.entity.Admin;
import com.furniture.mapper.AdminMapper;
import com.furniture.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author za
 * @since 2022-05-18
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
