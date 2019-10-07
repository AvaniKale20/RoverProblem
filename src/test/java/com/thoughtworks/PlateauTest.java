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

}
