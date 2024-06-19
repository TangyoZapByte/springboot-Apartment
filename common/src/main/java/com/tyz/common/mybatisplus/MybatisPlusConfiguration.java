package com.tyz.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tyz.web.*.mapper")
public class MybatisPlusConfiguration {
  
}