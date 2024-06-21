package com.tyz.web.app.service;

import com.tyz.web.app.vo.user.LoginVo;
import com.tyz.web.app.vo.user.UserInfoVo;

public interface LoginService {

    void getSMSCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoById(Long userId);
}
