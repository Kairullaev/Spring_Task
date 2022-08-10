package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Dog implements Eatable {
    @Value("${dog.name}")
    private String dogName;
    @Value("${dog.colour}")
    private String dogColour;
    @Value("${dog.age}")
    private int dogAge;

    public Dog() {
        System.out.println("Dog Bean is create");
    }

    public Dog(String dogName, String dogColour, int dogAge) {
        this.dogName = dogName;
        this.dogColour = dogColour;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColour() {
        return dogColour;
    }

    public void setDogColour(String dogColour) {
        this.dogColour = dogColour;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public void animalPlus() {
        System.out.println("Dog can guard your home and dog eat a lot of food");
        System.out.println(getDogName());
        System.out.println(getDogColour());
        System.out.println(getDogAge());
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog can bite your friend because they think there are stranger ");

    }
    @PostConstruct
    public void init(){
        System.out.println("Class Dog");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog destroy");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogColour='" + dogColour + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
