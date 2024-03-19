package com.wei.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 编辑请求
 *
 * @author <a href="https://github.com/7Ailun">艾伦</a>
 * 
 */
@Data
public class InterfaceInfoEditRequest implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String host;


    /**
     * 接口路径
     */
    private String url;


    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;



    private static final long serialVersionUID = 1L;
}