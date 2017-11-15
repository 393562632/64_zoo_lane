package com.lvmama.gibbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChenQiang on 2017/11/14.
 */
@RestController
public class HomePage {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
