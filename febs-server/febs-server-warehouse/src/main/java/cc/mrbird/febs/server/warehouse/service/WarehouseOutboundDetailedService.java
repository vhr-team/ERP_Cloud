package cc.mrbird.febs.server.warehouse.service;

import cc.mrbird.febs.common.core.entity.Warehouse.WarehouseOutboundDetailed;
import cc.mrbird.febs.common.core.entity.common.DataGridView;

/**
 * (WarehouseOutboundDetailed)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
public interface WarehouseOutboundDetailedService {

    /**
     *
     * @param id 出库详细单序号（用于条件查询出库详细单）
     * @return
     */
    DataGridView queryWarehouseOutboundDetailed(Integer page, Integer limit, Integer id);

    /**
     * 添加出库申请详细单
     *
     * @param warehouseOutboundDetailed
     */
    void addWarehouseOutboundDetailed(WarehouseOutboundDetailed warehouseOutboundDetailed);
}