package com.thoughtworks;


public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(int x_Coordinate, int y_Coordinate) {
        this.yCoordinate = y_Coordinate;
        this.xCoordinate = x_Coordinate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof Coordinate) {
            Coordinate that = (Coordinate) object;
            return this.xCoordinate == that.xCoordinate && this.yCoordinate == that.yCoordinate;
        }
        return true;
    }


    public boolean isAbove(Coordinate coordinate) {
        return (this.yCoordinate > coordinate.yCoordinate);
    }

    public boolean isBellow(Coordinate coordinate) {
        return (this.yCoordinate < coordinate.yCoordinate);
    }

    public boolean isRight(Coordinate coordinate) {
        return (coordinate.xCoordinate > this.xCoordinate);
    }

    public boolean isLeft(Coordinate coordinate) {
        return (coordinate.xCoordinate < this.xCoordinate);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }


}