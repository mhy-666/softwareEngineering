package Service.module.support.file.domain.dto;

import Service.common.anno.ApiModelPropertyEnum;
import Service.common.domain.PageParamDTO;
import Service.module.support.file.constant.FileModuleTypeEnum;
import Service.module.support.file.constant.FileServiceTypeEnum;
import Service.common.validator.en.CheckEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description: 文件信息查询dto
 * @Author: sbq
 * @CreateDate: 2019/7/3 17:38
 * @Version: 1.0
 */
@Data
public class FileQueryDTO extends PageParamDTO {

    @ApiModelProperty(value = "文件名称")
    private String fileName;

    @ApiModelProperty(value = "业务类型")
    @ApiModelPropertyEnum(FileModuleTypeEnum.class)
    @CheckEnum(enumClazz = FileModuleTypeEnum.class, message = "文件业务类型错误")
    private Integer moduleType;

    @ApiModelProperty(value = "文件位置")
    @ApiModelPropertyEnum(FileServiceTypeEnum.class)
    @CheckEnum(enumClazz = FileServiceTypeEnum.class, message = "文件位置类型错误")
    private Integer fileLocationType;

}
