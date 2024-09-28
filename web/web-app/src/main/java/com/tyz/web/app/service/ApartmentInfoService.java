package com.tyz.web.app.service;

import com.tyz.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyz.web.app.vo.apartment.ApartmentDetailVo;
import com.tyz.web.app.vo.apartment.ApartmentItemVo;

/**
 * @author liubo
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
 * @createDate 2023-07-26 11:12:39
 */
public interface ApartmentInfoService extends IService<ApartmentInfo> {
    ApartmentItemVo selectApartmentItemVoById(Long apartmentId);

    ApartmentDetailVo getApartmentDetailById(Long id);
}
