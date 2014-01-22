package com.cegeka.flyweight.tile;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    public static Map<Type, Tile> tiles = new HashMap<Type, Tile>();

    public static Tile makeTile(Type tileType) {
        Tile tile;
        switch (tileType) {
            case CERAMIC:
                tile = tiles.get(Type.CERAMIC);
                if (tile == null) {
                    tile = new CeramicTile();
                    tiles.put(Type.CERAMIC, tile);
                }
                break;
            case STONE:
                tile = tiles.get(Type.STONE);
                if (tile == null) {
                    tile = new StoneTile();
                    tiles.put(Type.STONE, tile);
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown tile type!");
        }
        return tile;
    }
}
