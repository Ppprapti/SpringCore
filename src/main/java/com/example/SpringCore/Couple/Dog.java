package com.example.SpringCore.Couple;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is Playing");
    }
}
