package com.okta.springbootwithauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class SimpleAppController {
    
    @RequestMapping("/")
    String home() {
        return "home";
    }
    
    @RequestMapping("/restricted")
    String restricted() {
        return "restricted";
    }

    @Autowired
    AdminService adminService;

    @RequestMapping("/admin")
    String admin() {
        adminService.ensureAdmin();
        return "admin";
    }

}