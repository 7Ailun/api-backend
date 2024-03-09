package com.wei.project.service.inner;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wei.project.common.ErrorCode;
import com.wei.project.exception.BusinessException;
import com.wei.project.mapper.InterfaceInfoMapper;
import com.wei.weiapicommon.model.entity.InterfaceInfo;
import com.wei.weiapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isBlank(url) || StringUtils.isBlank(method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "url不存在");
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        InterfaceInfo interfaceInfo = interfaceInfoMapper.selectOne(queryWrapper);
        if (BeanUtil.isEmpty(interfaceInfo)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口不存在");
        }
        return interfaceInfo;
    }
}
