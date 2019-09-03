package com.zb.service;

import com.zb.entity.Person;
import com.zb.util.Page;

public interface PersonService {

    public Page<Person> findPersonByPage(String name, Integer did, Integer index, Integer size);

    public String savePerson(Person person);

    public String updatePerson(Person person);

    public Person findPersonById(Integer id);

    public String deletePerson(Integer id);


}
