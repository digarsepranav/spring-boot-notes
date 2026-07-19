package com.beans.example;

import org.springframework.stereotype.Component;

@Component
public class MySQLDB implements Database{

    @Override
    public void save(String user) {
        System.out.println("We're in a My SQL Database : " + user);
    }
}
