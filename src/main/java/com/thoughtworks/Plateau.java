package com.thoughtworks;

import com.thoughtworks.exception.RoverNotAllowToGoForward;

public class Plateau {
    private Coordinate origin;
    private Coordinate end;
    private Rover rover;

    //todo-take information about why 1st rover dead
    public Plateau(Coordinate origin, Coordinate end) {
        this.origin = origin;
        this.end = end;
    }

    public boolean hasWithinBound(Coordinate coordinate) {
        return coordinate.isBetween(origin, end);
    }

    public boolean hasOutOfBound(Coordinate coordinate) {
        return coordinate.isOutSide(origin, end);
    }

    public boolean hasEqual(Coordinate coordinate) throws Exception {
        return coordinate.isEqual(coordinate,end);
//        Coordinate limit = new Coordinate(4, 4);
//        return coordinate == limit;
//        if (coordinate == limit) {
//            throw new RoverNotAllowToGoForward();
//        }
    }
}
