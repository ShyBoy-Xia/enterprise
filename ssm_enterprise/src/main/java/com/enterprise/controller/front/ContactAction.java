package com.enterprise.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 联系我们
 * Created by admin on 2020/8/15.
 */
@Controller("contactActionController")
@RequestMapping("/")
public class ContactAction{

    @RequestMapping("contact")
    public String contact() {
        return "/front/contact/contact";
    }

}
