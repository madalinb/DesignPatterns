package com.cegeka.decorator.starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    double cost() {
        return .99;
    }
}
