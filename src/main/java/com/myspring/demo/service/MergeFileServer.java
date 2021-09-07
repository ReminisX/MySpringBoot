package com.myspring.demo.service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.myspring.demo.entity.vo.FileInformationData;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

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
    public String mergeFiles(MultipartFile[] multipartFiles) throws IOException {

        if (multipartFiles.length <= 0) {
            return "null";
        }

        String[] type = multipartFiles[0].getContentType().split("/");
        File file = new File("temp" + "." + type[type.length-1]);
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        for (int i = 0; i < multipartFiles.length; i++) {
            FileInputStream fileInputStream = (FileInputStream) multipartFiles[i].getInputStream();
            int k = 0;
            byte[] bytes = new byte[1024];
            while ((k = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, k);
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
        return "OK";

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
        fileInformationData.setFileType(multipartFile.getContentType());

        String res = JSON.toJSONString(fileInformationData);
        return res;
    }

}
