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
        Coordinate coordinate = new Coordinate(0, 0);
        assertFalse(coordinate.isAbove(new Coordinate(0, 1)));
    }
    @Test
    void givenNegativeOneXCoordinateAndZeroCoordinate_WhenCheckIsAbove_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(0, 0);
        assertFalse(coordinate.isLeft(new Coordinate(-1, 0)));
    }
//
}
