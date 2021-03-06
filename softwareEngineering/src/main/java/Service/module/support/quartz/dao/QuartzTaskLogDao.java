package Service.module.support.quartz.dao;

import Service.module.support.quartz.domain.dto.QuartzLogQueryDTO;
import Service.module.support.quartz.domain.dto.QuartzTaskLogVO;
import Service.module.support.quartz.domain.entity.QuartzTaskLogEntity;
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
public interface QuartzTaskLogDao extends BaseMapper<QuartzTaskLogEntity>{


    /**
     * 查询列表
     * @param queryDTO
     * @return
     */
    List<QuartzTaskLogVO> queryList(Page page, @Param("queryDTO") QuartzLogQueryDTO queryDTO);
}
