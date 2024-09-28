package com.tyz.web.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyz.model.entity.BrowsingHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyz.web.app.vo.history.HistoryItemVo;

/**
* @author liubo
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface BrowsingHistoryService extends IService<BrowsingHistory> {
    IPage<HistoryItemVo> pageHistoryItemByUserId(Page<HistoryItemVo> page, Long userId);

    void saveHistory(Long userId, Long roomId);
}
