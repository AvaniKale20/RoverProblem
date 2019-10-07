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
    void someTest() {
        assertTrue(new Coordinate(1, 0).isBetween(getOrigin(), getFourFour()));
    }

}
