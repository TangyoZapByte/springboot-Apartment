package com.tyz.web.admin.service;

import com.tyz.web.admin.vo.login.CaptchaVo;
import com.tyz.web.admin.vo.login.LoginVo;
import com.tyz.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
