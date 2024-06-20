package com.tyz.web.admin.vo.apartment;


import com.tyz.model.entity.ApartmentInfo;
import com.tyz.model.entity.FacilityInfo;
import com.tyz.model.entity.LabelInfo;
import com.tyz.web.admin.vo.graph.GraphVo;
import com.tyz.web.admin.vo.fee.FeeValueVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "公寓信息")
@Data
public class ApartmentDetailVo extends ApartmentInfo {

    @Schema(description = "图片列表")
    private List<GraphVo> graphVoList;

    @Schema(description = "标签列表")
    private List<LabelInfo> labelInfoList;

    @Schema(description = "配套列表")
    private List<FacilityInfo> facilityInfoList;

    @Schema(description = "杂费列表")
    private List<FeeValueVo> feeValueVoList;

}
