package com.example.drools.controller;

import com.example.drools.domain.Person;
import com.example.drools.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonService personService;

//    @GetMapping("/showRults")
//    public String showRults(){
//        return "controller"+droolsService.fireRule();
//    }

    @PostMapping("/postPerson")
    public String postPerson(@RequestBody Person person){
        personService.makeIntroduce(person);
        return person.getIntroduce();
    }
}
