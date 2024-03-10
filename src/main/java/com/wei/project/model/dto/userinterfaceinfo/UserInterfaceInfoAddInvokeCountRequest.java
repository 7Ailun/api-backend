package com.wei.project.model.dto.userinterfaceinfo;

import lombok.Data;


/**
 * 添加接口次数请求
 */
@Data
public class UserInterfaceInfoAddInvokeCountRequest {

        /**
         * 接口信息id
         */
        private Long interfaceInfoId;

        /**
         * 用户 id
         */
        private Long userId;

        /**
         * 添加的次数
         */
        private Integer number;

}
