package com.thoughtworks;

public enum Direction {

    North {
        @Override
        Coordinate move() {
            return new Coordinate(0, 1);
        }

        @Override
        Direction moveLeft() {
            return West;
        }

        @Override
        Direction moveRight() {
            return East;
        }
    }, South {
        @Override
        Coordinate move() {
            return new Coordinate(0, -1);
        }

        @Override
        Direction moveLeft() {
            return East;
        }

        @Override
        Direction moveRight() {
            return West;
        }
    }, West {
        @Override
        Coordinate move() {
            return new Coordinate(-1, 0);
        }

        @Override
        Direction moveLeft() {
            return South;
        }

        @Override
        Direction moveRight() {
            return North;
        }
    }, East {
        @Override
        Coordinate move() {
            return new Coordinate(1, 0);
        }

        @Override
        Direction moveLeft() {
            return North;
        }

        @Override
        Direction moveRight() {
            return South;
        }
    };

    abstract Coordinate move();

    abstract Direction moveLeft();

    abstract Direction moveRight();
}
