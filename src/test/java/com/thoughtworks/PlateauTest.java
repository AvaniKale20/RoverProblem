package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    private Coordinate getOrigin() {
        return new Coordinate(0, 0);
    }

    private Coordinate getFourFour() {
        return new Coordinate(4, 4);
    }

    @Test
    void givenRoverWithOneXCoordinateAndZeroYCoordinate_whenCheckIsWithinPlateau_ThenReturnTrue() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertTrue(plateau.hasWithinBound(new Coordinate(1, 0)));
    }

    @Test
    void givenRover_whenCheckIsWithinPlateau_ThenReturnTrue() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertTrue(plateau.hasWithinBound(new Coordinate(0, 1)));
    }

    @Test
    void givenRoverWithZeroXCoordinateAndNegativeOnYCoordinate_whenCheckIsWithinPlateau_ThenReturnFalse() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertFalse(plateau.hasWithinBound(new Coordinate(0, -1)));
    }


    @Test
    void givenRoverWithNegativeOneXCoordinateAndZeroYCoordinate_whenCheckIsWithinPlateau_ThenReturnFalse() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertFalse(plateau.hasWithinBound(new Coordinate(-1, 0)));
    }
}
