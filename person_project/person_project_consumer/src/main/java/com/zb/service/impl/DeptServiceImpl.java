package com.zb.service.impl;

import com.zb.entity.Dept;
import com.zb.feign.DeptFeignClient;
import com.zb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired(required = false)
    private DeptFeignClient deptFeignClient;

    @Override
    public List<Dept> findDeptList() {
        return deptFeignClient.findDeptList();
    }

}
