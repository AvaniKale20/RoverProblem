package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;

public class Rover {
    private Direction direction;
    private Coordinate coordinate;
    private Plateau plateau;
    private boolean isDead = false;//no

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
        this.coordinate = newCoordinate;
        if (plateau.hasOutOfBound(newCoordinate)) {
            isDead = true;
            throw new RoverDeadException();
        }
        return newCoordinate;

    }

    public Direction turnLeft() throws RoverDeadException {
        if (isDead) {
            throw new RoverDeadException();
        }
        direction = direction.moveLeft();
        return direction;
    }


    public Direction turnRight() throws RoverDeadException {
        if (isDead) {
            throw new RoverDeadException();
        }
        direction = direction.moveRight();
        return direction;
    }

}


