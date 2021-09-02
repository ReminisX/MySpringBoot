package com.myspring.demo.controller;

import com.myspring.demo.server.MergeFileServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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

    @RequestMapping(path = "", method = RequestMethod.POST)
    public String getFileInformation(@RequestParam(name = "file") MultipartFile multipartFile) {
        return mergeFileServer.showFileInformation(multipartFile);
    }

}
