package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void givenCoordinate_WhenCheckIsSameOrNot_ThenShouldReturnTrue() {
        Coordinate coordinate = new Coordinate(0, 0);
        assertTrue(coordinate.isSame(0, 0));
    }

    @Test
    void givenOneCoordinateAndOneCoordinate_WhenCheckIsSameOrNot_ThenShouldReturnTrue() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertTrue(coordinate.isSame(1, 1));
    }

    @Test
    void givenZeroCoordinateAndZeroCoordinate_WhenCheckIsUpperOrNot_ThenShouldReturnTrue() {
        Coordinate coordinate = new Coordinate(0, 0);
        assertFalse(coordinate.isUpper(1, 1));
    }

    @Test
    void givenOneCoordinateAndOneCoordinate_WhenCheckIsUpperOrNot_ThenShouldReturnTrue() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertTrue(coordinate.isUpper(0, 0));
    }
}
