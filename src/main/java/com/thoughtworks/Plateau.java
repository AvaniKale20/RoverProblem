package com.thoughtworks;

public class Plateau {
    private Coordinate origin;
    private Coordinate end;

    public Plateau(Coordinate origin, Coordinate end) {
        this.origin = origin;
        this.end = end;
    }

    public boolean hasWithinBound(Coordinate coordinate) {
        return coordinate.isBetween(origin, end);
    }
}
