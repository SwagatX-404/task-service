package com.swg.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="USER_SERVICE", url="http://localhost:5001")
public interface UserService {


}
