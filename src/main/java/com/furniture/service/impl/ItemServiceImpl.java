package com.furniture.service.impl;

import com.furniture.entity.Item;
import com.furniture.mapper.ItemMapper;
import com.furniture.service.ItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

}
