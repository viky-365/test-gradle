package com.hello.entities;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by Viky on 8/3/2014.
 */
@Entity
@Table(name = "Addr")
public class Addr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Addr{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
