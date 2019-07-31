package com.example.drools.service;

import com.example.drools.domain.Person;
import com.example.drools.tool.KieSessionUtils;
import org.springframework.stereotype.Service;

/**
 * @author Leaf
 */
@Service
public class PersonService {

    public void makeIntroduce(Person person){
        KieSessionUtils.fireRule(person);


    }


}
