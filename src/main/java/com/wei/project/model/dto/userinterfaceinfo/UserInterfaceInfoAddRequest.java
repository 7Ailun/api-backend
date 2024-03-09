package com.wei.project.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class UserInterfaceInfoAddRequest implements Serializable {

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

}