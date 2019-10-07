package com.thoughtworks;

public class Rover {
    Direction direction;
    Coordinate coordinate;

    public Rover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Coordinate move() {
        return coordinate.move(direction);
    }

    public Direction moveLeft() {
        return direction.moveLeft();
    }

    public Direction moveRight() {
        return direction.moveRight();
    }

}


