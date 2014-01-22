package com.cegeka.decorator.starbuzz;

public class Main {
    public static void main(String[] args){

        Beverage espresso = new Espresso();
        System.out.println("Total cost for: " + espresso.getDescription() + " is $" + espresso.cost());

/*        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage =  new Whip(beverage);*/

        Beverage beverage = new Mocha(new Mocha(new Soy(new Whip(new HouseBlend()))));

        System.out.println("Total cost for: " + beverage.getDescription() + " is $" + beverage.cost());

    }
}
