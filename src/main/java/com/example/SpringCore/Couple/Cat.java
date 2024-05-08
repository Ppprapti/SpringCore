package com.example.SpringCore.Couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cat")
//or
//@Component
//@Qualifier("cat")
//@Primary -- This is used when we are not using qualifier
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat is Playing");
    }
}
