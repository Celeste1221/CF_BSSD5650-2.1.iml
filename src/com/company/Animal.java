package com.company;

public abstract class Animal implements IAnimal {

    public String covering;

    public String pet(){
        return "Petting " + covering;
    }
    public String speak(){
        return "Speaking";
    }
}
