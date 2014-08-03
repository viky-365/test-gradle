package com.hello.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Viky on 8/2/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/META-INF/test-context.xml")
public class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;


    @Test
    public void getPersonTest(){
        System.out.print("Hello World");
        System.out.print(personRepository.findAll());

    }
}
