package com.wei.project.model.vo;


import lombok.Data;

import java.util.Date;
@Data

public class UserInterfaceInfoVO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 接口信息id
     */
    private Long interfaceInfoId;

    /**
     * 剩余次数
     */
    private Integer leftNum;

    /**
     * 总次数
     */
    private Integer totalNum;

    /**
     * 0 - 开启 1 - 关闭
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
