package com.tyz.web.app.service;

import com.tyz.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyz.web.app.vo.appointment.AppointmentDetailVo;
import com.tyz.web.app.vo.appointment.AppointmentItemVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {
    List<AppointmentItemVo> listItemByUserId(Long userId);

    AppointmentDetailVo getDetailById(Long id);
}
