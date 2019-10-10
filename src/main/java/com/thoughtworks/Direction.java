package com.thoughtworks;

public enum Direction {

    North {
        @Override
        Coordinate move() {
            return new Coordinate(0, 1);
        }

        @Override
        Direction moveLeft() {
            return  West;
        }

        @Override
        Direction moveRight() {
            return Direction.East;
        }
    }, South {
        @Override
        Coordinate move() {
            return new Coordinate(0, -1);
        }

        @Override
        Direction moveLeft() {
            return Direction.East;
        }

        @Override
        Direction moveRight() {
            return Direction.West;
        }
    }, West {
        @Override
        Coordinate move() {
            return new Coordinate(-1, 0);
        }

        @Override
        Direction moveLeft() {
            return Direction.South;
        }

        @Override
        Direction moveRight() {
            return Direction.North;
        }
    }, East {
        @Override
        Coordinate move() {
            return new Coordinate(1, 0);
        }

        @Override
        Direction moveLeft() {
            return Direction.North;
        }

        @Override
        Direction moveRight() {
            return Direction.South;
        }
    };

    abstract Coordinate move();

    abstract Direction moveLeft();

    abstract Direction moveRight();
}
