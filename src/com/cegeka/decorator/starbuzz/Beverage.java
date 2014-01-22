package com.cegeka.decorator.starbuzz;

abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
