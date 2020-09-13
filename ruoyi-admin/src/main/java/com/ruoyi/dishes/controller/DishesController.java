package com.ruoyi.dishes.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.dishes.domain.Dishes;
import com.ruoyi.dishes.service.IDishesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 菜品列表Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/dishes/dishes")
public class DishesController extends BaseController
{
    private String prefix = "dishes/dishes";

    @Autowired
    private IDishesService dishesService;

    @RequiresPermissions("dishes:dishes:view")
    @GetMapping()
    public String dishes()
    {
        return prefix + "/dishes";
    }

    /**
     * 查询菜品列表列表
     */
    @RequiresPermissions("dishes:dishes:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Dishes dishes)
    {
        startPage();
        List<Dishes> list = dishesService.selectDishesList(dishes);
        return getDataTable(list);
    }

    /**
     * 导出菜品列表列表
     */
    @RequiresPermissions("dishes:dishes:export")
    @Log(title = "菜品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Dishes dishes)
    {
        List<Dishes> list = dishesService.selectDishesList(dishes);
        ExcelUtil<Dishes> util = new ExcelUtil<Dishes>(Dishes.class);
        return util.exportExcel(list, "dishes");
    }

    /**
     * 新增菜品列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存菜品列表
     */
    @RequiresPermissions("dishes:dishes:add")
    @Log(title = "菜品列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Dishes dishes)
    {
        return toAjax(dishesService.insertDishes(dishes));
    }

    /**
     * 修改菜品列表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Dishes dishes = dishesService.selectDishesById(id);
        mmap.put("dishes", dishes);
        return prefix + "/edit";
    }

    /**
     * 修改保存菜品列表
     */
    @RequiresPermissions("dishes:dishes:edit")
    @Log(title = "菜品列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Dishes dishes)
    {
        return toAjax(dishesService.updateDishes(dishes));
    }

    /**
     * 删除菜品列表
     */
    @RequiresPermissions("dishes:dishes:remove")
    @Log(title = "菜品列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dishesService.deleteDishesByIds(ids));
    }
}
