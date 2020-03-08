package com.ljs.controller;

import com.ljs.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理登陆controller
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login()throws Exception{
        return "login";
    }
}
