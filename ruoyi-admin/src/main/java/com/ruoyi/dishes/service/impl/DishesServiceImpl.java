package com.ruoyi.dishes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.dishes.mapper.DishesMapper;
import com.ruoyi.dishes.domain.Dishes;
import com.ruoyi.dishes.service.IDishesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜品列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class DishesServiceImpl implements IDishesService 
{
    @Autowired
    private DishesMapper dishesMapper;

    /**
     * 查询菜品列表
     * 
     * @param id 菜品列表ID
     * @return 菜品列表
     */
    @Override
    public Dishes selectDishesById(Long id)
    {
        return dishesMapper.selectDishesById(id);
    }

    /**
     * 查询菜品列表列表
     * 
     * @param dishes 菜品列表
     * @return 菜品列表
     */
    @Override
    public List<Dishes> selectDishesList(Dishes dishes)
    {
        return dishesMapper.selectDishesList(dishes);
    }

    /**
     * 新增菜品列表
     * 
     * @param dishes 菜品列表
     * @return 结果
     */
    @Override
    public int insertDishes(Dishes dishes)
    {
        return dishesMapper.insertDishes(dishes);
    }

    /**
     * 修改菜品列表
     * 
     * @param dishes 菜品列表
     * @return 结果
     */
    @Override
    public int updateDishes(Dishes dishes)
    {
        return dishesMapper.updateDishes(dishes);
    }

    /**
     * 删除菜品列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDishesByIds(String ids)
    {
        return dishesMapper.deleteDishesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除菜品列表信息
     * 
     * @param id 菜品列表ID
     * @return 结果
     */
    @Override
    public int deleteDishesById(Long id)
    {
        return dishesMapper.deleteDishesById(id);
    }
}
