package Service.module.system.systemconfig.domain.entity;

import Service.common.domain.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 系统配置参数 实体类
 *
 * @author GHQ
 * @date 2017-12-23 13:41
 */
@Data
@TableName(value = "t_system_config")
public class SystemConfigEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 257284726400352502L;

    /**
     * 参数key
     */
    private String configKey;

    /**
     * 参数的值
     */
    private String configValue;

    /**
     * 参数名称
     */
    private String configName;

    /**
     * 参数类别
     */
    private String configGroup;

    /**
     * 是否使用0 是 1否
     */
    private Integer isUsing;

    /**
     * 备注
     */
    private String remark;

}
