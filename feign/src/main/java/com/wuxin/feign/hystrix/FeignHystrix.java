package com.wuxin.feign.hystrix;

import com.wuxin.feign.remote.StudentRemote;

public class FeignHystrix implements StudentRemote {
    @Override
    public String getNameById(int id) {
        return "error request"+id;
    }
}
