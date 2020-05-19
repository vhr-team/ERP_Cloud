package cc.mrbird.febs.server.warehouse.controller;

import cc.mrbird.febs.common.core.entity.Warehouse.WarehouseOutbound;
import cc.mrbird.febs.common.core.entity.common.DataGridView;
import cc.mrbird.febs.common.core.entity.common.Response;
import cc.mrbird.febs.server.warehouse.service.WarehouseOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (WarehouseOutbound)表控制层
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
@RestController
@RequestMapping("warehouseOutbound")
public class WarehouseOutboundController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseOutboundService warehouseOutboundServiceImpl;


    /**
     * 查询可调度的数据进行调度
     * @param check_tag 审核标志 0待审核 1审核通过 2审核不通过
     * @param page
     * @param limit
     * @return
     */
    //@ApiOperation(value = "查询可调度的数据进行调度")
    @RequestMapping("queryWarehouseOutbound")
    public DataGridView queryWarehouseOutbound(@RequestParam("check_tag") String check_tag,
                                               @RequestParam("page") Integer page,
                                               @RequestParam("limit") Integer limit){
        return warehouseOutboundServiceImpl.queryWarehouseOutbound(check_tag, page, limit);
    }


    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    //@ApiOperation(value = "添加出库申请单")
    @RequestMapping("addWarehouseOutbound")
    public Response addWarehouseOutbound(@RequestBody WarehouseOutbound warehouseOutbound){
        return warehouseOutboundServiceImpl.addWarehouseOutbound(warehouseOutbound);
    }

}