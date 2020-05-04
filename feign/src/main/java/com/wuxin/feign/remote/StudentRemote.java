package com.wuxin.feign.remote;


import com.wuxin.feign.config.FeignConfiguration;
import com.wuxin.feign.hystrix.FeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "wuxin-server",path = "",configuration = FeignConfiguration.class,fallback = FeignHystrix.class)
@Service
public interface StudentRemote {

    @GetMapping(value = "/info")
    String getNameById(@RequestParam(value = "id") int id);

}
