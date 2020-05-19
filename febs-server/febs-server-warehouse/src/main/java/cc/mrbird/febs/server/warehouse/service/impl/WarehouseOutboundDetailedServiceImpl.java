package cc.mrbird.febs.server.warehouse.service.impl;


import cc.mrbird.febs.common.core.entity.Warehouse.WarehouseOutboundDetailed;
import cc.mrbird.febs.common.core.entity.common.DataGridView;
import cc.mrbird.febs.server.warehouse.mapper.WarehouseOutboundDetailedMapper;
import cc.mrbird.febs.server.warehouse.service.WarehouseOutboundDetailedService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (WarehouseOutboundDetailed)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@SuppressWarnings("all")
@Service("warehouseOutboundDetailedServiceImpl")
public class WarehouseOutboundDetailedServiceImpl implements WarehouseOutboundDetailedService {
    @Autowired
    private WarehouseOutboundDetailedMapper warehouseOutboundDetailedMapper;


    @Override
    public DataGridView queryWarehouseOutboundDetailed(Integer page, Integer limit, Integer id) {
        QueryWrapper<WarehouseOutboundDetailed> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","product_name","product_id","amount").eq("parent_id",id);

        return null;
    }


    /**
     * 添加出库申请详细单
     *
     * @param warehouseOutboundDetailed
     */
    @Override
    public void addWarehouseOutboundDetailed(WarehouseOutboundDetailed warehouseOutboundDetailed) {
        warehouseOutboundDetailedMapper.insert(warehouseOutboundDetailed);
    }
}