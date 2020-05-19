package cc.mrbird.febs.common.core.entity.common;

import lombok.Data;

import java.io.Serializable;

/**数据回显
 * @author 谷辉
 * @create 2020-04-20日 11:03
 */

@Data
public class Response implements Serializable {
    private boolean success;//操作是否成功
    private String message;//相应信息

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
