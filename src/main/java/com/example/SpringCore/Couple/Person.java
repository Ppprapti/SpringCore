package com.example.SpringCore.Couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    Animal animal;

    public void PlayWithAnimal()
    {
      animal.play();
    }
}
