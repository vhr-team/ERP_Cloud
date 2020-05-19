package cc.mrbird.febs.server.warehouse.service;

import cc.mrbird.febs.common.core.entity.Warehouse.WarehouseInboundDetailed;
import cc.mrbird.febs.common.core.entity.common.DataGridView;

/**
 * (WarehouseInboundDetailed)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
public interface WarehouseInboundDetailedService {


    /**
     * 入库调度表的调度查询
     *
     * @param id 父级序号
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryInboundDetailed(Integer id, int page, int limit);

    /**
     * 插入入库详细表
     * @param warehouseInboundDetailed
     * @return
     */
    void insertWarehouseDetailed(WarehouseInboundDetailed warehouseInboundDetailed);

}