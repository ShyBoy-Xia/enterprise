package com.enterprise.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页
 * Created by admin on 2020/8/15.
 */
@Controller
@RequestMapping("/")
public class IndexAction {
    @RequestMapping({"/", "/index"})
    public String index() {
        return "/front/index";
    }


}

