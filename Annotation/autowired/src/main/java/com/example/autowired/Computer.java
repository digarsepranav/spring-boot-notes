package com.example.autowired;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final KeyBoard keyBoard;
// We mush initialize the keyboard
    public Computer(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
    public void start() {
        System.out.println("Computer Started ");
        keyBoard.type();
    }
}
