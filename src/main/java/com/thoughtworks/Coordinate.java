package com.thoughtworks;


public class Coordinate {
    protected int xCoordinate;
    protected int yCoordinate;

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

    //Addition
    public Coordinate move(Direction direction) {
        return new Coordinate(xCoordinate + direction.move().xCoordinate, yCoordinate + direction.move().yCoordinate);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    public boolean isRight(Coordinate coordinate) {
        return xCoordinate > coordinate.xCoordinate;
    }

    public boolean isAbove(Coordinate coordinate) {
        return  yCoordinate>coordinate.yCoordinate;
    }

    public boolean isLeft(Coordinate coordinate) {
        return xCoordinate<coordinate.xCoordinate;
    }
}