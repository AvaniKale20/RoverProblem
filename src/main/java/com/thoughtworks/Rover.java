package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;

public class Rover {
    private Direction direction;
    private Coordinate coordinate;
    private Plateau plateau;

    public Rover(Coordinate coordinate, Direction direction, Plateau plateau) {
        this.direction = direction;
        this.coordinate = coordinate;
        this.plateau = plateau;
    }

    Rover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Coordinate move() throws RoverDeadException {
        Coordinate newCoordinate = coordinate.move(direction);
        if (plateau.hasOutOfBound(newCoordinate)) {
            throw new RoverDeadException();
        }
        return coordinate.move(direction);
    }

    public Direction turnLeft() {
        return direction.moveLeft();
    }


    public Direction turnRight() {
        return direction.moveRight();
    }

}


