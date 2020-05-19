package cc.mrbird.febs.server.desgin.service;


import cc.mrbird.febs.server.desgin.entity.PageResult;
import cc.mrbird.febs.server.desgin.pojo.product_design_material;

import java.util.List;

/**
 * 物料档案
 *
 * @author joker_dj
 * @create 2020-05-01日 14:42
 */
public interface design_materialService {
    /**
     * 分页查询物料
     *
     * @param page
     * @param pageSize
     * @param material
     * @return
     */
    PageResult findpage(Integer page, Integer pageSize, product_design_material material);

    void addmaterial(product_design_material material);

    void updatematerial(product_design_material material);

    List<product_design_material> selectAll();

    List<product_design_material> selectAll(product_design_material material);

    product_design_material selectById(String Id);
}
