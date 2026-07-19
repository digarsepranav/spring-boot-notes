package com.beans.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MySQLDB implements Database{

    @Override
    public void save(String user) {
        System.out.println("We're in a My SQL Database : " + user);
    }
}
