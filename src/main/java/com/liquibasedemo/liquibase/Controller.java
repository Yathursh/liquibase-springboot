package com.liquibasedemo.liquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class Controller {

    private PersonRepository personRepository;

    public String createPerson(@RequestParam String name){
        personRepository.save(new Person(name, "6.7"));
        return personRepository.findByName(name) + "Saved successfully";
    }

    public List<Person> getAllThePeople(){
        return (List<Person>) personRepository.findAll();
    }




}
