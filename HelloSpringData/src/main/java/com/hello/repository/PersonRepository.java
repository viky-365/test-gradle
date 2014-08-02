package com.hello.repository;

import com.hello.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Viky on 8/2/2014.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
