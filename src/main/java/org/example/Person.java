package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Scope(scopeName = "prototype")

public class Person {
    @Value("${person.name}")
    public String name;
    @Value("${person.age}")
    private int age;
    private Eatable eatable;


    public Person() {
        System.out.println("Person Bean is created");
    }

    public Person(String name, int age, Eatable eatable) {
        this.name = name;
        this.age = age;
        this.eatable = eatable;
    }
    @Autowired
    public Person( @Qualifier("dog") Eatable eatable) {
        this.eatable = eatable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eatable getEatable() {
        return eatable;
    }

    public void setEatable(Eatable eatable) {
        this.eatable = eatable;
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Person");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Person destroy");
    }
    public void callYourMethod(){
        eatable.animalPlus();
        System.out.println(getAge());
        System.out.println(getName());
    }
    public void callYourMethod2(){
        eatable.animalMinus();
    }
}

