package org.javathon16.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    public int phoneNumber;

    public String name;

}
