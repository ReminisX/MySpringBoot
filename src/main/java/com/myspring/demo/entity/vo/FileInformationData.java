package com.myspring.demo.entity.vo;

import lombok.Data;

/**
 * @Author ZhangXD
 * @Date 2021/9/2 10:14
 * @Description
 */
@Data
public class FileInformationData {

    /**
     * file param name
     */
    private String fileParam;

    /**
     * file original name
     */
    private String fileName;

    /**
     * file type
     */
    private String type;

    /**
     * file size
     */
    private Long fileSize;

}
