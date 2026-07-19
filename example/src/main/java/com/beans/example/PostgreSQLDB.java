package com.beans.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue = "postgresql")
public class PostgreSQLDB implements Database {

    @Override
    public void save(String user) {
        System.out.println("We're in Postgre SQL DB : " + user);
    }
}
