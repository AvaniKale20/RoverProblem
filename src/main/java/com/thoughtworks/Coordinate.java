package com.thoughtworks;

public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }

   public boolean isSame(int xCoordinate,int yCoordinate)
    {
        return ((this.yCoordinate==xCoordinate)&&(this.xCoordinate==xCoordinate));
    }
}
