package com.cegeka.flyweight.tile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ceramic Tiles");

        for (int i = 0; i < 3; i++){
            Tile ceramicTile = TileFactory.makeTile(Type.CERAMIC);
            ceramicTile.draw(10, 10, 50, 50);
        }

        System.out.println("Stone Tiles");

        for (int i = 0; i < 5; i++){
            Tile stoneTile = TileFactory.makeTile(Type.STONE);
            stoneTile.draw(5, 10, 20, 50);
        }

        System.out.println("Total objects created:" + (CeramicTile.objectCounter + StoneTile.objectCounter));
    }
}
