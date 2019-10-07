package com.thoughtworks;

public class Plateau {
    private Coordinate origin;
    private Coordinate end;

    public Plateau(Coordinate origin, Coordinate end) {
        this.origin = origin;
        this.end = end;
    }

    public boolean hasWithingBound(Coordinate coordinate) {
        return coordinate.yCoordinate > origin.yCoordinate && coordinate.yCoordinate < end.yCoordinate;
    }
}
