package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Shark implements Eatable{
    @Value("${shark.name}")
    private String name;
    @Value("${shark.colour}")
    private String colour;
    @Value("${shark.height}")
    private int height;

    public Shark() {
        System.out.println("Shar Bean is create");
    }

    public Shark(String name, String colour, int height) {
        this.name = name;
        this.colour = colour;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void animalPlus() {
        System.out.println("Shark can swim so fast");
        System.out.println(getName());
        System.out.println(getColour());
        System.out.println(getHeight());

    }

    @Override
    public void animalMinus() {
        System.out.println("Shark is most dangerous predator");

    }
    @PostConstruct
    public void init(){
        System.out.println("Class Shark");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Shark destroy");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }
}
