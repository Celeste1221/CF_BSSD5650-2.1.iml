package com.company;

public class Turtle extends Animal {
    public Turtle(){
        covering = "feathers";
    }

    @Override
    public String eat() {
        return "ate some grass";
    }

    @Override
    public String speak() {
        return "squeak";
    }
}
