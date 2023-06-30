package com.afishing.reggie.service.impl;

import com.afishing.reggie.entity.Employee;
import com.afishing.reggie.mapper.EmployeeMapper;
import com.afishing.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
