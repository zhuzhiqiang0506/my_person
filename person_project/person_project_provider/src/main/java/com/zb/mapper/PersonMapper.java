package com.zb.mapper;

import com.zb.entity.Person;
import com.zb.util.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {

    public List<Person> findPersonByPage(@Param("name") String name, @Param("did") Integer did, @Param("index") Integer index, @Param("size") Integer size);

    public int findPersonCount(@Param("name") String name, @Param("did") Integer did);

    public void savePerson(Person person);

    public void updatePerson(Person person);

    public Person findPersonById(@Param("id") Integer id);

    public void deletePerson(@Param("id") Integer id);

}
