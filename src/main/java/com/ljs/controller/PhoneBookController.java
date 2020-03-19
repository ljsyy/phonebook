package com.ljs.controller;

import com.ljs.entity.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phoneBook")
public class PhoneBookController {

    @RequestMapping("/list")
    public R getPhoneBookList(){

        return R.ok("通讯录详细列表");
    }
}
