package Service.module.support.quartz.dao;

import Service.module.support.quartz.domain.dto.QuartzQueryDTO;
import Service.module.support.quartz.domain.dto.QuartzTaskVO;
import Service.module.support.quartz.domain.entity.QuartzTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * [  ]
 *
 * @author yandanyang
 * @version 1.0
 * @company 1024lab.net
 * @copyright (c) 2018 1024lab.netInc. All rights reserved.
 * @date 2019/4/13 0013 下午 14:35
 * @since JDK1.8
 */
@Mapper
@Component
public interface QuartzTaskDao extends BaseMapper<QuartzTaskEntity> {

    /**
     * 更新任务状态
     * @param taskId
     * @param taskStatus
     */
    void updateStatus(@Param("taskId") Integer taskId,@Param("taskStatus") Integer taskStatus);

    /**
     * 查询列表
     * @param queryDTO
     * @return
     */
    List<QuartzTaskVO> queryList(Page page, @Param("queryDTO") QuartzQueryDTO queryDTO);

}
