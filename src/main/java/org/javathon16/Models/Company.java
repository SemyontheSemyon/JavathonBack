package org.javathon16.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int maxBonus;

    private Company(){};

    public Company(Long id, String name, int maxBonus){
        this.id = id;
        this.name = name;
        this.maxBonus = maxBonus;
    }

}
