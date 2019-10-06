package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void givenOneAndOneCoordinate_WhenCheckIsAboveFromOriginalPosition_ThenReturnTrue() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertTrue(coordinate.isAbove(new Coordinate(0, 0)));
    }

}
