package com.afishing.reggie.service.impl;

import com.afishing.reggie.common.CustomException;
import com.afishing.reggie.entity.Category;
import com.afishing.reggie.entity.Dish;
import com.afishing.reggie.entity.Setmeal;
import com.afishing.reggie.mapper.CategoryMapper;
import com.afishing.reggie.service.CategoryService;
import com.afishing.reggie.service.DishService;
import com.afishing.reggie.service.SetmealService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private SetmealService setmealService;

    @Autowired
    private DishService dishService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();

        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        if(count1>0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if(count2>0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        super.removeById(id);
    }
}
