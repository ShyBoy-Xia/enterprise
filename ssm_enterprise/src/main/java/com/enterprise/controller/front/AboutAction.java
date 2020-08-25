package com.enterprise.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 关于我们
 * Created by admin on 2020/8/14.
 */
@Controller("aboutActionController")
@RequestMapping("/")
public class AboutAction {

    @RequestMapping("about")
    public String contact() {
        return "/front/about/about";
    }

}
