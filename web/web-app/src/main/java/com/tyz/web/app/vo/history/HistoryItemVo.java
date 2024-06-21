package com.tyz.web.app.vo.history;


import com.tyz.model.entity.BrowsingHistory;
import com.tyz.model.enums.ReleaseStatus;
import com.tyz.web.app.vo.graph.GraphVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "浏览历史基本信息")
public class HistoryItemVo extends BrowsingHistory {

    @Schema(description = "房间号")
    private String roomNumber;

    @Schema(description = "租金")
    private BigDecimal rent;

    @Schema(description = "房间图片列表")
    private List<GraphVo> roomGraphVoList;

    @Schema(description = "公寓名称")
    private String apartmentName;

    @Schema(description = "省份名称")
    private String provinceName;

    @Schema(description = "城市名称")
    private String cityName;

    @Schema(description = "区县名称")
    private String districtName;

}
