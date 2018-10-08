package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/save/{name}/{age}")
    public String save(@PathVariable String name, @PathVariable int age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personRepository.save(person);
        return "Saved";
    }



}
