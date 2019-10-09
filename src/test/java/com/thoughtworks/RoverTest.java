package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    private Coordinate getOrigin() {
        return new Coordinate(0, 0);
    }
    private Coordinate getFourFour()
    {
        return new Coordinate(4,4);
    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInNorthDirection() throws Exception {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 0), Direction.North, plateau);
        assertEquals(new Coordinate(0, 1), rover.move());
    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInSouthDirection() throws Exception {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 0), Direction.South, plateau);
        assertEquals(new Coordinate(0, -1), rover.move());
    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInWestDirection() throws Exception {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 0), Direction.West, plateau);
        assertEquals(new Coordinate(-1, 0), rover.move());
    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInEastDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(),getFourFour());
        Rover rover = new Rover(new Coordinate(0, 0), Direction.East, plateau);
        assertEquals(new Coordinate(1, 0), rover.move());
    }

    //////
    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInNorthDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 1), Direction.North, plateau);
        assertEquals(new Coordinate(0, 2), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInEastDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 0), Direction.East, plateau);
        assertEquals(new Coordinate(2, 0), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInSouthDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, -2), Direction.South, plateau);
        assertEquals(new Coordinate(0, -3), rover.move());

    }

    @Test
    void givenRoverStartingSomewhereElse_WhenMove_ThenShouldAbleMoveOneStepInWestDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(),getFourFour());
        Rover rover = new Rover(new Coordinate(1, 0), Direction.West, plateau);
        assertEquals(new Coordinate(0, 0), rover.move());

    }


    @Nested
    class DirectionTest {

        private Direction getRoverFacingNorth() {
            return Direction.North;
        }

        private Direction getRoverFacingWest() {
            return Direction.West;
        }

        private Direction getRoverFacingSouth() {
            return Direction.South;
        }

        private Direction getRoverFacingEast() {
            return Direction.East;
        }


        @Test
        void givenRoverFacingAtNorthDirection_WhenTurnRight_ThenShouldAbleToTurnToEast() {
            Rover rover = new Rover(getOrigin(), getRoverFacingNorth());
            assertEquals(Direction.East, rover.turnRight());
        }

        @Test
        void givenRoverFacingAtNorthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() {
            Rover rover = new Rover(getOrigin(), getRoverFacingNorth());
            assertEquals(Direction.West, rover.turnLeft());
        }


        @Test
        void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToEast() {
            Rover rover = new Rover(getOrigin(), getRoverFacingSouth());
            assertEquals(Direction.East, rover.turnLeft());
        }

        @Test
        void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() {
            Rover rover = new Rover(getOrigin(), getRoverFacingSouth());
            assertEquals(Direction.West, rover.turnRight());
        }


        @Test
        void givenRoverFacingAtEastDirection_WhenTurnRight_ThenShouldAbleToTurnToSouth() {
            Rover rover = new Rover(getOrigin(), getRoverFacingEast());
            assertEquals(Direction.South, rover.turnRight());
        }

        @Test
        void givenRoverFacingAtEastDirection_WhenTurnRight_ThenShouldAbleToTurnToNorth() {
            Rover rover = new Rover(getOrigin(), getRoverFacingEast());
            assertEquals(getRoverFacingNorth(), rover.turnLeft());
        }

        @Test
        void givenRoverFacingAtWestDirection_WhenTurnRight_ThenShouldAbleToTurnToNorth() {
            Rover rover = new Rover(getOrigin(), getRoverFacingWest());
            assertEquals(getRoverFacingNorth(), rover.turnRight());
        }

        @Test
        void givenRoverFacingAtWestDirection_WhenTurnLeft_ThenShouldAbleToTurnToSouth() {
            Rover rover = new Rover(getOrigin(), getRoverFacingWest());
            assertEquals(Direction.South, rover.turnLeft());
        }
    }
}
