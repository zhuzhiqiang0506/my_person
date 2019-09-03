package com.zb.service.impl;

import com.zb.entity.Person;
import com.zb.feign.PersonFeignClient;
import com.zb.service.PersonService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired(required = false)
    private PersonFeignClient personFeignClient;

    @Override
    public Page<Person> findPersonByPage(String name, Integer did, Integer index, Integer size) {
        return personFeignClient.findPersonByPage(name, did, index, size);
    }

    @Override
    public String savePerson(Person person) {
        return personFeignClient.savePerson(person);
    }

    @Override
    public String updatePerson(Person person) {
        return personFeignClient.updatePerson(person);
    }

    @Override
    public Person findPersonById(Integer id) {
        return personFeignClient.findPersonById(id);
    }

    @Override
    public String deletePerson(Integer id) {
        return personFeignClient.deletePerson(id);
    }

}
