package com.wei.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 调用请求
 *
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String requestParams;

    private static final long serialVersionUID = 1L;
}