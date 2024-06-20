package com.tyz.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyz.model.entity.ApartmentLabel;
import com.tyz.web.admin.service.ApartmentLabelService;
import com.tyz.web.admin.mapper.ApartmentLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService{

}




