package im.zhaojun.zfile.module.filter.controller;

import im.zhaojun.zfile.core.util.AjaxJson;
import im.zhaojun.zfile.module.filter.model.entity.FilterConfig;
import im.zhaojun.zfile.module.filter.service.FilterConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 存储源过滤器维护接口
 *
 * @author zhaojun
 */
@Api(tags = "存储源模块-过滤文件")
@RestController
@RequestMapping("/admin")
public class StorageSourceFilterController {

    @Resource
    private FilterConfigService filterConfigService;

    @ApiOperation(value = "获取存储源过滤文件列表", notes = "根据存储源 ID 获取存储源设置的过滤文件列表")
    @ApiImplicitParam(paramType = "path", name = "storageId", value = "存储源 id", required = true, dataTypeClass = Integer.class)
    @GetMapping("/storage/{storageId}/filters")
    public AjaxJson<List<FilterConfig>> getFilters(@PathVariable Integer storageId) {
        return AjaxJson.getSuccessData(filterConfigService.findByStorageId(storageId));
    }


    @ApiOperation(value = "保存存储源过滤文件列表", notes = "保存指定存储源 ID 设置的过滤文件列表")
    @ApiImplicitParam(paramType = "path", name = "storageId", value = "存储源 id", required = true, dataTypeClass = Integer.class)
    @PostMapping("/storage/{storageId}/filters")
    public AjaxJson<Void> saveFilters(@PathVariable Integer storageId, @RequestBody List<FilterConfig> filter) {
        filterConfigService.batchSave(storageId, filter);
        return AjaxJson.getSuccess();
    }

}