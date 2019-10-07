package com.thoughtworks;

public class Plateau {
    private Coordinate origin;
    private Coordinate end;

    public Plateau(Coordinate origin, Coordinate end) {
        this.origin = origin;
        this.end = end;
    }

    public boolean hasWithingBound(Coordinate coordinate) {
        if (coordinate.isRight(origin)) {
            return true;
        }
        if (coordinate.isAbove(origin)) {
            return true;
        }
        if (coordinate.isLeft(origin)) {
            return false;
        }
        if (coordinate.isBellow(origin)) {

        }
        return false;
    }
}
