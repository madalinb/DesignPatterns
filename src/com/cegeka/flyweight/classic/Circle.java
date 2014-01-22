package com.cegeka.flyweight.classic;

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int r;

    public Circle(){
        this.x = 10;
        this.y = 20;
        this.r = 30;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(this + "Circle was drawn with [Color: " + color + ", x = " + x + " y = " + y + ", radius = " + r);
    }
}
