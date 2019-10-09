package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    // TODO - remove duplication
    private Coordinate getOrigin() {
        return new Coordinate(0, 0);
    }

    private Coordinate getFourFour() {
        return new Coordinate(4, 4);
    }

    @Test
    void givenOneXCoordinateAndZeroYCoordinate_WhenCheckIsBetween_ThenReturnTrue() {
        assertTrue(new Coordinate(1, 0).isBetween(getOrigin(), getFourFour()));
    }

    @Test
    void givenNegativeOneXCoordinateAndZeroYCoordinate_WhenCheckIsOutSide_ThenReturnTrue() {
        assertTrue(new Coordinate(5, 5).isOutSide(getOrigin(), getFourFour()));
    }

}
