package com.thoughtworks;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInNorthDirection() {
        Rover rover = new Rover(new Coordinate(0, 0), Direction.North);
        assertEquals(new Coordinate(0, 1), rover.move());

    }


    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInSouthDirection() {
        Rover rover = new Rover(new Coordinate(0, 0), Direction.South);
        assertEquals(new Coordinate(0, -1), rover.move());

    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInWestDirection() {
        Rover rover = new Rover(new Coordinate(0, 0), Direction.West);
        assertEquals(new Coordinate(-1, 0), rover.move());

    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInEastDirection() {
        Rover rover = new Rover(new Coordinate(0, 0), Direction.East);
        assertEquals(new Coordinate(1, 0), rover.move());

    }

    //////
    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInNorthDirection() {
        Rover rover = new Rover(new Coordinate(0, 1), Direction.North);
        assertEquals(new Coordinate(0, 2), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInEastDirection() {
        Rover rover = new Rover(new Coordinate(1, 0), Direction.East);
        assertEquals(new Coordinate(2, 0), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInSouthDirection() {
        Rover rover = new Rover(new Coordinate(0, -2), Direction.South);
        assertEquals(new Coordinate(0, -3), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInWestDirection() {
        Rover rover = new Rover(new Coordinate(1, 0), Direction.West);
        assertEquals(new Coordinate(0, 0), rover.move());

    }

    @Nested
    class DirectionTest {

        @Test
        void givenRoverFacingAtNorthDirection_WhenTurnRight_ThenShouldAbleToTurnToEast() {
            Rover rover = new Rover(new Coordinate(0, 0), Direction.North);
            assertEquals(Direction.East, rover.moveRight());
        }

        @Test
        void givenRoverFacingAtNorthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() {
            Rover rover = new Rover(new Coordinate(0, 0), Direction.North);
            assertEquals(Direction.West, rover.moveLeft());
        }

        @Test
        void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToEast() {
            Rover rover = new Rover(new Coordinate(0, 0), Direction.South);
            assertEquals(Direction.East, rover.moveLeft());
        }

        @Test
        void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() {
            Rover rover = new Rover(new Coordinate(0, 0), Direction.South);
            assertEquals(Direction.West, rover.moveRight());
        }
    }
}
