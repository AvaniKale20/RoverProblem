package com.thoughtworks;

public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

  public  Coordinate(int x_Coordinate, int y_Coordinate) {
      this.yCoordinate=y_Coordinate;
      this.xCoordinate=x_Coordinate;
  }

    @Override
    public boolean equals(Object object) {
        Coordinate that = (Coordinate) object;
        return this.xCoordinate == that.xCoordinate && this.yCoordinate == that.yCoordinate;

    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
