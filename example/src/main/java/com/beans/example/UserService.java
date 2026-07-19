package com.beans.example;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void saveUser(String user) {
        db.save("Pranav");
    }
}
