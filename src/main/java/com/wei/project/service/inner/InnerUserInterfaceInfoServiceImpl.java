package com.wei.project.service.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wei.project.common.ErrorCode;
import com.wei.project.exception.BusinessException;
import com.wei.project.service.impl.UserInterfaceInfoServiceImpl;
import com.wei.weiapicommon.model.entity.UserInterfaceInfo;
import com.wei.weiapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Resource
    private UserInterfaceInfoServiceImpl userInterfaceInfoService;
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public int getLeftNum(long interfaceInfoId, long userId) {
        if(interfaceInfoId <= 0 || userId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"用户接口信息不存在");
        }
        QueryWrapper<UserInterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("interfaceInfoId",interfaceInfoId).eq("userId",userId);
        UserInterfaceInfo userInterfaceInfo = userInterfaceInfoService.getOne(queryWrapper);
        if(userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        return userInterfaceInfo.getLeftNum();
    }


}
