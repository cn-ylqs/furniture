package com.furniture.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.furniture.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author za
 * @since 2022-05-18
 */
public interface DepartmentMapper extends BaseMapper<Department> {
    @Override
    int insert(Department entity);

    @Override
    int deleteById(Serializable id);

    @Override
    int deleteByMap(Map<String, Object> columnMap);

    @Override
    int delete(Wrapper<Department> queryWrapper);

    @Override
    int deleteBatchIds(Collection<? extends Serializable> idList);

    @Override
    int updateById(Department entity);

    @Override
    int update(Department entity, Wrapper<Department> updateWrapper);

    @Override
    Department selectById(Serializable id);

    @Override
    List<Department> selectBatchIds(Collection<? extends Serializable> idList);

    @Override
    List<Department> selectByMap(Map<String, Object> columnMap);

    @Override
    Department selectOne(Wrapper<Department> queryWrapper);

    @Override
    Integer selectCount(Wrapper<Department> queryWrapper);

    @Override
    List<Department> selectList(Wrapper<Department> queryWrapper);

    @Override
    List<Map<String, Object>> selectMaps(Wrapper<Department> queryWrapper);

    @Override
    List<Object> selectObjs(Wrapper<Department> queryWrapper);

    @Override
    <E extends IPage<Department>> E selectPage(E page, Wrapper<Department> queryWrapper);

    @Override
    <E extends IPage<Map<String, Object>>> E selectMapsPage(E page, Wrapper<Department> queryWrapper);
}
