package com.thoughtworks;

public class Rover {
    Direction direction;
    Coordinate coordinate;


    public Rover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Coordinate move() {
//        return direction.move();
        return coordinate.move(direction);
    }

}


