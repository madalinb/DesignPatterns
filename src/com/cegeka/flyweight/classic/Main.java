package com.cegeka.flyweight.classic;

public class Main {
    public static final String colors[] = {"Red", "Green"};

    public static void main(String[] args) {

        System.out.println("Red Circles");
        for (int i = 0; i < 5; i++){
            Circle circle = (Circle)ShapeFactory.getShape("circle");
            circle.setColor(colors[0]);
            circle.draw();
        }

        System.out.println("\nGreen Circles");
        for (int i = 0; i < 2; i++){
            Circle circle = (Circle)ShapeFactory.getShape("circle");
            circle.setColor(colors[1]);
            circle.draw();
        }

    }
}
