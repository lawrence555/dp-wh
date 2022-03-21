package com.dp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author LLF
 * @Date Created in 2022/3/18 16:09
 * @Description
 * @Version 2.0
 **/
public class TextSentinel{

    public static String fallBack() {
        return "熔断消息";
    }

}
