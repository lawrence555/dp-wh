package com.dp.controller;

import com.dp.FeiginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LLF
 * @Date Created in 2022/3/15 17:05
 * @Description
 * @Version 2.0
 **/

@RestController()
@RequestMapping("risk")
public class RiskController {

    @Autowired
    private FeiginService feiginService;

    @GetMapping("xx")
    public String xfzz(){
        return feiginService.xx();
    }
}
