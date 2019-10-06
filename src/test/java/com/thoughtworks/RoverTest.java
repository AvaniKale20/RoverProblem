package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInNorthDirection() {
        Rover rover = new Rover(Direction.North);
        assertEquals(new Coordinate(0, 1), rover.moveOneStepAtNorth());

    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInSouthDirection() {
        Rover rover = new Rover(Direction.South);
        assertEquals(new Coordinate(0, -1), rover.moveOneStepAtSouth());

    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInWestDirection() {
        Rover rover = new Rover(Direction.West);
        assertEquals(new Coordinate(-1, 0), rover.moveOneStepAtSWest());

    }

}
