package cc.mrbird.febs.server.desgin.entity;

import cc.mrbird.febs.server.desgin.pojo.product_design_record;
import cc.mrbird.febs.server.desgin.pojo.product_material_archives;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-02日 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class material_archives implements Serializable {
    private product_design_record record;
    private List<product_material_archives> archives;


}
