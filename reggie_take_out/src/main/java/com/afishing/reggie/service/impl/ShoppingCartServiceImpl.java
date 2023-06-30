package com.afishing.reggie.service.impl;

import com.afishing.reggie.entity.ShoppingCart;
import com.afishing.reggie.mapper.ShoppingCartMapper;
import com.afishing.reggie.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
