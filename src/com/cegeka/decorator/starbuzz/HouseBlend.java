package com.cegeka.decorator.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    double cost() {
        return .89;
    }
}
