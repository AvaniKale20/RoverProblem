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

    public boolean isBetween(Coordinate origin, Coordinate end) {
        return isXCoordinateBetween(origin, end) && isYCoordinateBetween(origin, end);
    }

    private boolean isXCoordinateBetween(Coordinate origin, Coordinate end) {
        return origin.xCoordinate <= xCoordinate && xCoordinate <= end.xCoordinate;
    }

    private boolean isYCoordinateBetween(Coordinate origin, Coordinate end) {
        return origin.yCoordinate <= yCoordinate && yCoordinate <= end.yCoordinate;
    }

    ///////
    public boolean isOutSide(Coordinate origin, Coordinate end) {
        return isXCoordinateOutSide(origin, end) && isYCoordinateOutSide(origin, end);
    }

    public boolean isLeft(Coordinate origin, Coordinate end) {
        return isXCoordinateOutSide(origin, end);
    }

    private boolean isYCoordinateOutSide(Coordinate origin, Coordinate end) {
        return origin.yCoordinate < yCoordinate && yCoordinate > end.yCoordinate;

    }

    private boolean isXCoordinateOutSide(Coordinate origin, Coordinate end) {
        return origin.xCoordinate < xCoordinate && xCoordinate > end.xCoordinate;
    }


}