package com.zb.feign;

import com.zb.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "person-project-provider")
public interface DeptFeignClient {

    @RequestMapping(value = "/findDeptList", method = RequestMethod.GET)
    public List<Dept> findDeptList();

}
