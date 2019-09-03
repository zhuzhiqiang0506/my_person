package com.zb.controller;

import com.zb.entity.Dept;
import com.zb.entity.Person;
import com.zb.service.PersonService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/showPerson")
    public Page<Person> showPerson(String name, Integer did, @RequestParam(defaultValue = "1") Integer index) {
        return personService.findPersonByPage(name, did, index, 2);
    }

    @RequestMapping(value = "/savePerson")
    public String savePerson(@RequestBody Person person, Integer did) {
        System.out.println(did);
        Dept dept = new Dept();
        dept.setDeptId(did);
        person.setDept(dept);
        personService.savePerson(person);
        return "ok";
    }

    @RequestMapping(value = "/updatePerson")
    public String updatePerson(@RequestBody Person person, Integer did) {
        Dept dept = new Dept();
        dept.setDeptId(did);
        person.setDept(dept);
        personService.updatePerson(person);
        return "ok";
    }

    @RequestMapping(value = "/findPersonById")
    public Person findPersonById(Integer id) {
        return personService.findPersonById(id);
    }

    @RequestMapping(value = "/deletePerson")
    public String deletePerson(Integer id) {
        personService.deletePerson(id);
        return "ok";
    }

}
