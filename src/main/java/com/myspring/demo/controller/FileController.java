package com.myspring.demo.controller;

import com.myspring.demo.service.MergeFileServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author ZhangXD
 * @Date 2021/9/2 10:25
 * @Description
 */
@Controller
@RequestMapping("/file")
@ResponseBody
public class FileController {

    @Autowired
    private MergeFileServer mergeFileServer;

    @RequestMapping(path = "/get", method = RequestMethod.POST)
    public String getFileInformation(@RequestParam(name = "file") MultipartFile multipartFile) {
        return mergeFileServer.showFileInformation(multipartFile);
    }

    @RequestMapping(path = "/merge", method = RequestMethod.POST)
    public String mergeFiles(@RequestParam(name = "files") MultipartFile[] multipartFile) throws IOException {
        return mergeFileServer.mergeFiles(multipartFile);
    }

}
