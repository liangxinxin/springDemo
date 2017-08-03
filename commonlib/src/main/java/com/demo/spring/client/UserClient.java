package com.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liangxinxin on 3/8/17.
 */
@Service
@FeignClient("user-service")
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/user/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
