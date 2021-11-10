package com.heima.pattern.decorator;

public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}
