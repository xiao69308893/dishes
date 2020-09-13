package com.ruoyi.dishes.service;

import java.util.List;
import com.ruoyi.dishes.domain.Dishes;

/**
 * 菜品列表Service接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface IDishesService 
{
    /**
     * 查询菜品列表
     * 
     * @param id 菜品列表ID
     * @return 菜品列表
     */
    public Dishes selectDishesById(Long id);

    /**
     * 查询菜品列表列表
     * 
     * @param dishes 菜品列表
     * @return 菜品列表集合
     */
    public List<Dishes> selectDishesList(Dishes dishes);

    /**
     * 新增菜品列表
     * 
     * @param dishes 菜品列表
     * @return 结果
     */
    public int insertDishes(Dishes dishes);

    /**
     * 修改菜品列表
     * 
     * @param dishes 菜品列表
     * @return 结果
     */
    public int updateDishes(Dishes dishes);

    /**
     * 批量删除菜品列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDishesByIds(String ids);

    /**
     * 删除菜品列表信息
     * 
     * @param id 菜品列表ID
     * @return 结果
     */
    public int deleteDishesById(Long id);
}
