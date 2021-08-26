package com.company;

public class Duck extends Animal {

    public Duck(){
        covering = "feathers";
    }

    @Override
    public String eat() {
        return "ate some bread";
    }

    @Override
    public String speak() {
        return "quack quack";
    }
}
