package com.zb.service;

import com.zb.entity.Person;
import com.zb.mapper.PersonMapper;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonService {

    @Autowired(required = false)
    private PersonMapper personMapper;

    @RequestMapping(value = "/findPersonByPage", method = RequestMethod.GET)
    public Page<Person> findPersonByPage(String name, Integer did, @RequestParam(defaultValue = "1") Integer index, @RequestParam(defaultValue = "2") Integer size) {

        Page page = new Page();
        List<Person> list = personMapper.findPersonByPage(name, did, (index - 1) * size, size);
        page.setIndex(index);
        page.setSize(size);
        page.setCount(personMapper.findPersonCount(name, did));
        page.setData(list);
        return page;

    }

    @RequestMapping(value = "/savePerson", method = RequestMethod.POST)
    public String savePerson(@RequestBody Person person) {
        personMapper.savePerson(person);
        return "ok";
    }

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    public String updatePerson(@RequestBody Person person) {
        personMapper.updatePerson(person);
        return "ok";
    }

    @RequestMapping(value = "/findPersonById/{id}", method = RequestMethod.GET)
    public Person findPersonById(@PathVariable("id") Integer id) {
        return personMapper.findPersonById(id);
    }

    @RequestMapping(value = "/deletePerson/{id}", method = RequestMethod.GET)
    public String deletePerson(@PathVariable("id") Integer id) {
        personMapper.deletePerson(id);
        return "ok";
}

}
