package com.thoughtworks;

public enum Direction {

    North {
        @Override
        Coordinate move() {
            return new Coordinate(0, 1);
        }
    }, South {
        @Override
        Coordinate move() {
            return new Coordinate(0, -1);
        }
    }, West {
        @Override
        Coordinate move() {
            return new Coordinate(-1, 0);
        }
    }, East {
        @Override
        Coordinate move() {
            return new Coordinate(1, 0);
        }
    };

    abstract Coordinate move();
}
