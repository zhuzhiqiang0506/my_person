package com.zb.feign;

import com.zb.entity.Person;
import com.zb.util.Page;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "person-project-provider")
public interface PersonFeignClient {

    @RequestMapping(value = "/findPersonByPage", method = RequestMethod.GET)
    public Page<Person> findPersonByPage(@RequestParam("name") String name, @RequestParam("did") Integer did, @RequestParam(value = "index", defaultValue = "1") Integer index, @RequestParam(value = "size", defaultValue = "2") Integer size);

    @RequestMapping(value = "/savePerson", method = RequestMethod.POST)
    public String savePerson(@RequestBody Person person);

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    public String updatePerson(@RequestBody Person person);

    @RequestMapping(value = "/findPersonById/{id}", method = RequestMethod.GET)
    public Person findPersonById(@PathVariable("id") Integer id);

    @RequestMapping(value = "/deletePerson/{id}", method = RequestMethod.GET)
    public String deletePerson(@PathVariable("id") Integer id);

}
