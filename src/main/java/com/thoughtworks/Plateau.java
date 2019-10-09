package com.thoughtworks;

public class Plateau {
    private Coordinate origin;
    private Coordinate end;
    private Rover rover;

    public Plateau(Coordinate origin, Coordinate end) {
        this.origin = origin;
        this.end = end;
    }

    public boolean hasWithinBound(Coordinate coordinate) {
        return coordinate.isBetween(origin, end);
    }
    public boolean hasOutOfBound(Coordinate coordinate)
    {
        return coordinate.isOutSide(origin,end);
    }
}
