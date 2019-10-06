package com.thoughtworks;

public class Rover {
    Direction direction;
    Coordinate coordinate;

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public Coordinate move() {
        return direction.move();
    }
}


