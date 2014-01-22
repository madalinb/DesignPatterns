package com.cegeka.flyweight.tile;

public class CeramicTile implements Tile {

    public static int objectCounter = 0;

    public String color;

    public CeramicTile() {
        this.color = "Red";
        ++objectCounter;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println(this + " Ceramic Tile was drawn with [Color: " + color + ", x = " + x + " y = " + y + ", width = "  + width + ", height = " + height + "]");
    }
}
