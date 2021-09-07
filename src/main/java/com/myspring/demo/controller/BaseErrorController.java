package com.myspring.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhangXD
 * @Date 2021/9/7 19:38
 * @Description
 */
@Controller
@RequestMapping(value = "error")
public class BaseErrorController implements ErrorController {
    private static final Logger logger = LoggerFactory.getLogger(BaseErrorController.class);

    @RequestMapping
    public String error() {
        return getErrorPath();
    }

    /**
     * The return value from this method is not used; the property `server.error.path`
     * must be set to override the default error page path.
     *
     * @return the error path
     * @deprecated since 2.3.0 in favor of setting the property `server.error.path`
     */
    @Override
    public String getErrorPath() {
        return null;
    }
}

