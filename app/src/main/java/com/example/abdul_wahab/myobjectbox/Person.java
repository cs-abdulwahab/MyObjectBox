package com.example.abdul_wahab.myobjectbox;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by Abdul-Wahab on 12/13/2017.
 */
@Entity
public class Person {
    @Id
    public long id;
    public String name;

    public Person(String name) {

        this.name = name;
    }
}
