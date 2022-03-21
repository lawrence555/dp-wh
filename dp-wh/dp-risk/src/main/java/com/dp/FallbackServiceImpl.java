package com.dp;

import org.springframework.stereotype.Component;

/**
 * @Author LLF
 * @Date Created in 2022/3/15 17:35
 * @Description
 * @Version 2.0
 **/

@Component
public class FallbackServiceImpl implements FeiginService {

    @Override
    public String xx() {
        return "熔断信息";
    }
}
