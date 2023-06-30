package com.afishing.reggie.dto;

import com.afishing.reggie.entity.Setmeal;
import com.afishing.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
