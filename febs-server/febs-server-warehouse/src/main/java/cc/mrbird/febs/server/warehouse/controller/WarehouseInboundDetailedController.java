package cc.mrbird.febs.server.warehouse.controller;

import cc.mrbird.febs.common.core.entity.common.DataGridView;
import cc.mrbird.febs.server.warehouse.service.WarehouseInboundDetailedService;
import cc.mrbird.febs.server.warehouse.service.WarehouseInboundService;
import cc.mrbird.febs.server.warehouse.service.WarehouseStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (WarehouseInboundDetailed)表控制层
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
@RestController
@RequestMapping("warehouseInboundDetailed")
public class WarehouseInboundDetailedController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseInboundDetailedService warehouseInboundDetailedServiceImpl;

    @Autowired
    private WarehouseInboundService warehouseInboundServiceImpl;

    @Autowired
    private WarehouseStockService warehouseStockServiceImpl;


    /**
     * 通过产品编号获取安全库存的当前存储量和最大存储量，求出剩余存储量
     *
     * @param product_id 库存编号
     * @param page
     * @param limit
     * @return
     */
    //@ApiOperation("通过产品编号获取安全库存的当前可存放数量")
    @RequestMapping("queryInventory")
    public DataGridView queryInventory(String product_id, Integer page, Integer limit) {
        return warehouseStockServiceImpl.queryInventory(product_id, page, limit);
    }

    /**
     * 入库调度表的调度查询
     *
     * @param id 父级序号
     * @param page
     * @param limit
     * @return
     */
    //@ApiOperation(value = "入库调度表的调度查询")
    @RequestMapping("queryInboundDetailed")
    public DataGridView queryInboundDetailed(@RequestParam("id") Integer id,
                                             @RequestParam("page") int page,
                                             @RequestParam("limit") int limit) {

       return warehouseInboundDetailedServiceImpl.queryInboundDetailed(id, page, limit);
    }


}