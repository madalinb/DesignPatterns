package com.cegeka.flyweight.tile;

public class StoneTile implements Tile {

    public static int objectCounter = 0;

    public String color;

    public StoneTile() {
        this.color = "Green";
        ++objectCounter;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println(this + " Stone Tile was drawn with [Color: " + color + ", x = " + x + " y = " + y + ", width = " + width + ", height = " + height +"]");
    }
}
