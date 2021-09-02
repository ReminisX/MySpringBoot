package com.myspring.demo.server;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.myspring.demo.entity.vo.FileInformationData;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author ZhangXD
 * @Date 2021/9/2 9:55
 * @Description files server
 */
@Service
public class MergeFileServer {

    /**
     * merge files if they are the same type
     * @param multipartFiles
     * @return file
     */
    public MultipartFile mergeFiles(MultipartFile[] multipartFiles) {

        if (multipartFiles.length <= 0) {
            return null;
        }

        if (multipartFiles.length == 1) {
            return multipartFiles[0];
        }

        return multipartFiles[0];

    }

    /**
     * get file information as Json type
     * @param multipartFile
     * @return String of Json type
     */
    public String showFileInformation(MultipartFile multipartFile) {

        FileInformationData fileInformationData = new FileInformationData();
        fileInformationData.setFileParam(multipartFile.getName());
        fileInformationData.setFileName(multipartFile.getOriginalFilename());
        fileInformationData.setFileSize(multipartFile.getSize());
        fileInformationData.setType(multipartFile.getContentType());

        String res = JSON.toJSONString(fileInformationData);
        return res;
    }

}
