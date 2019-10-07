package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void givenOneAndOneCoordinate_WhenCheckIsRight_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(0, 0);
        assertFalse(coordinate.isRight(new Coordinate(1, 1)));
    }

    @Test
    void givenOneAndZeroCoordinate_WhenCheckIsRight_ThenReturnTrue() {
        Coordinate coordinate = new Coordinate(1, 0);
        assertTrue(coordinate.isRight(new Coordinate(0, 0)));
    }

    @Test
    void givenOneAndOneCoordinate_WhenCheckIsAbove_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(0, 1);
        assertTrue(coordinate.isAbove(new Coordinate(0, 0)));
    }

    @Test
    void givenNegativeOneXCoordinateAndZeroCoordinate_WhenCheckIsLeft_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(-1, 0);
        assertTrue(coordinate.isLeft(new Coordinate(0, 0)));
    }

    @Test
    void givenNegativeOneXCoordinateAndZeroCoordinate_WhenCheckIsBellow_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(-1, 0);
        assertFalse(coordinate.isBellow(new Coordinate(0, 0)));
    }
}
