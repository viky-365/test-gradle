package com.hello.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Viky on 8/3/2014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/META-INF/test-context.xml")
public class AddrRepositoryTest {

    @Autowired
    AddrRepository repository;


    @Test
    public void getAddrTest(){
        System.out.print(repository.findOne(2));
    }
}
