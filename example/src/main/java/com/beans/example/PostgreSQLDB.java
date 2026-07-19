package com.beans.example;

import org.springframework.stereotype.Component;

@Component
public class PostgreSQLDB implements Database {

    @Override
    public void save(String user) {
        System.out.println("We're in Postgre SQL DB : " + user);
    }
}
