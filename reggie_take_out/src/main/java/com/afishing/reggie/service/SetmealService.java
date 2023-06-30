package com.afishing.reggie.service;

import com.afishing.reggie.dto.SetmealDto;
import com.afishing.reggie.entity.Setmeal;
import com.afishing.reggie.entity.SetmealDish;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long>ids);

    SetmealDto getByIdWithDish(Long id);

    void updateWithDish(SetmealDto setmealDto);
}
