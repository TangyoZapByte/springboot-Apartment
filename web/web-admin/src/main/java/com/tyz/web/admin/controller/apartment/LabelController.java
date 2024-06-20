package com.tyz.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tyz.common.result.Result;
import com.tyz.model.entity.LabelInfo;
import com.tyz.model.enums.ItemType;
import com.tyz.web.admin.service.LabelInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "标签管理")
@RestController
@RequestMapping("/admin/label")
public class LabelController {
    @Autowired
    private LabelInfoService labelInfoService;

    @Operation(summary = "（根据类型）查询标签列表")
    @GetMapping("list")
    public Result<List<LabelInfo>> labelList(@RequestParam(required = false) ItemType type) {
        LambdaQueryWrapper<LabelInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(type != null,LabelInfo::getType,type);
        List<LabelInfo> list = labelInfoService.list(queryWrapper);
        return Result.ok();
    }

    @Operation(summary = "新增或修改标签信息")
    @PostMapping("saveOrUpdate1")
    public Result saveOrUpdateLabel(@RequestBody LabelInfo labelInfo) {

        return Result.ok();
    }

    @Operation(summary = "保存或更新标签信息")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdateFacility(@RequestBody LabelInfo labelInfo) {
        labelInfoService.saveOrUpdate(labelInfo);
        return Result.ok();
    }

    @Operation(summary = "根据id删除标签信息")
    @DeleteMapping("deleteById")
    public Result deleteLabelById(@RequestParam Long id) {
        return Result.ok();
    }
}
