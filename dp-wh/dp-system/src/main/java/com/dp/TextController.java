package com.dp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LLF
 * @Date Created in 2022/3/15 15:05
 * @Description
 * @Version 2.0
 **/

@RestController
@RequestMapping("system")
public class TextController {

    @Autowired
    TextService textService;

    @GetMapping("xx")
    public String xx(){
        return textService.xx();
    }

}
