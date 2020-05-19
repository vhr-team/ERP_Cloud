package cc.mrbird.febs.server.warehouse.controller;

import cc.mrbird.febs.server.warehouse.service.WarehouseOutboundDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (WarehouseOutboundDetailed)表控制层
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@RestController
@RequestMapping("warehouseOutboundDetailed")
public class WarehouseOutboundDetailedController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseOutboundDetailedService warehouseOutboundDetailedServiceImpl;



}