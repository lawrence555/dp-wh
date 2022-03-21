package com.dp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author LLF
 * @Date Created in 2022/3/15 17:03
 * @Description
 * @Version 2.0
 **/

@FeignClient(value = "dp-system",fallback = FallbackServiceImpl.class)
public interface FeiginService {

    @GetMapping(value = "/system/xx")
    String xx();
}
