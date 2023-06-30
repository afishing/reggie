package com.afishing.reggie.service;

import com.afishing.reggie.dto.DishDto;
import com.afishing.reggie.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavors(Long id);

    void updateWithFlavor(DishDto dishDto);
}
