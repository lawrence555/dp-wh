package com.dp;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;


/**
 * @Author LLF
 * @Date Created in 2022/3/18 16:07
 * @Description
 * @Version 2.0
 **/

@Service
public class TextServiceImpl implements TextService {

    @SentinelResource(value = "xx",fallbackClass = TextSentinel.class,fallback = "fallBack")
    @Override
    public String xx() {
        throw new RuntimeException("发生异常");

    }


}
