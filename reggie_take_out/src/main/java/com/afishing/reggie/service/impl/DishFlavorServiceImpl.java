package com.afishing.reggie.service.impl;

import com.afishing.reggie.entity.DishFlavor;
import com.afishing.reggie.mapper.DishFlavorMapper;
import com.afishing.reggie.service.DishFlavorService;
import com.afishing.reggie.service.DishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
