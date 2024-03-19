package com.wei.project.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @author <a href="https://github.com/7Ailun">艾伦</a>
 * 
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;

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

    private static final long serialVersionUID = 1L;
}