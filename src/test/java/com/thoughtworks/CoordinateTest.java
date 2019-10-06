package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void givenOneAndOneCoordinate_WhenCheckIsAboveFromOriginalPosition_ThenReturnTrue() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertTrue(coordinate.isAbove(new Coordinate(0, 0)));
    }

    @Test
    void givenTwoAndOneCoordinate_WhenCheckIsAboveFromOriginalPosition_ThenReturnTrue() {
        Coordinate coordinate = new Coordinate(2, 2);
        assertTrue(coordinate.isAbove(new Coordinate(0, 0)));
    }

    @Test
    void givenNegativeOneAndOneCoordinate_WhenCheckIsBellowFromOriginalPosition_ThenReturnTrue() {
        Coordinate coordinate = new Coordinate(-1, -1);
        assertTrue(coordinate.isBellow(new Coordinate(0, 0)));
    }
}
