package com.hello.repository;

import com.hello.entities.Addr;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Viky on 8/3/2014.
 */
public interface AddrRepository extends JpaRepository<Addr,Integer> {
}
