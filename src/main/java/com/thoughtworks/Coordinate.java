package com.thoughtworks;

import java.util.Objects;

public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(int x_Coordinate, int y_Coordinate) {
        this.yCoordinate = y_Coordinate;
        this.xCoordinate = x_Coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
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

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
