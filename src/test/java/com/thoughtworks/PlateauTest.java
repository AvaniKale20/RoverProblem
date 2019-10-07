package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    @Test
    void givenRover_whenCheckIsWithinPlateau_ThenReturnTrue() {
        Coordinate origin = new Coordinate(0, 0);
        Coordinate end = new Coordinate(4, 4);
        Plateau plateau = new Plateau(origin, end);
        assertTrue(plateau.hasWithingBound(new Coordinate(0, 1)));
    }

    @Test
    void givenRoverWithZeroXCoordinateAndNegativeOnYCoordinate_whenCheckIsWithinPlateau_ThenReturnFalse() {
        Coordinate origin = new Coordinate(0, 0);
        Coordinate end = new Coordinate(4, 4);
        Plateau plateau = new Plateau(origin, end);
        assertFalse(plateau.hasWithingBound(new Coordinate(0, -1)));
    }

    @Test
    void givenRoverWithOneXCoordinateAndZeroYCoordinate_whenCheckIsWithinPlateau_ThenReturnTrue() {
        Coordinate origin = new Coordinate(0, 0);
        Coordinate end = new Coordinate(4, 4);
        Plateau plateau = new Plateau(origin, end);
        assertTrue(plateau.hasWithingBound(new Coordinate(1, 0)));
    }

    @Test
    void givenRoverWithNegativeOneXCoordinateAndZeroYCoordinate_whenCheckIsWithinPlateau_ThenReturnFalse() {
        Coordinate origin = new Coordinate(0, 0);
        Coordinate end = new Coordinate(4, 4);
        Plateau plateau = new Plateau(origin, end);
        assertFalse(plateau.hasWithingBound(new Coordinate(-1, 0)));
    }
}
