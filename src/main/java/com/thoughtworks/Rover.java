package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;
import com.thoughtworks.exception.RoverNotAllowToGoForward;


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

    public Coordinate move() throws Exception {
        Coordinate newCoordinate = coordinate.moveForwards(direction);
        shouldNotAbleToMove();
        if (plateau.hasOutOfBound(newCoordinate)) {
            isDead = true;
            throw new RoverDeadException();
        }
        this.coordinate = newCoordinate;
        return newCoordinate;
    }

    public boolean shouldNotAbleToMove() throws Exception {
        if (plateau.hasEqual(coordinate)) {
            throw new RoverNotAllowToGoForward();
        }
        return false;
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


