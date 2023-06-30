package com.afishing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afishing.reggie.entity.OrderDetail;
import com.afishing.reggie.mapper.OrderDetailMapper;
import com.afishing.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}