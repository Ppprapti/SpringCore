package com.example.SpringCore.Couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("cat")    //here we need to mentioned qualifier name
    Animal animal;

    public void PlayWithAnimal()
    {
      animal.play();
    }
}
