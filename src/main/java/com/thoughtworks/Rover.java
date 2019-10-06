package com.thoughtworks;

public class Rover {
    Direction direction;

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public Coordinate moveOneStepAtNorth() {
        return new Coordinate(0, 1);
    }

    public Coordinate moveOneStepAtSouth() {
        return new Coordinate(0, -1);
    }

    public Coordinate moveOneStepAtSWest() {
        return new Coordinate(-1, 0);
    }
}


