package com.zb.service;

import com.zb.entity.Dept;
import com.zb.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @RequestMapping(value = "/findDeptList", method = RequestMethod.GET)
    public List<Dept> findDeptList() {
        return deptMapper.findDeptList();
    }

}
