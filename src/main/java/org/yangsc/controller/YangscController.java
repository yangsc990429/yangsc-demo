package org.yangsc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class YangscController
{
    @RequestMapping("index")
    public  String  ContIndex(Model model){

        model.addAttribute("add","萨芬健康博客疯狂的啦");

        return  "index";
    }



}
