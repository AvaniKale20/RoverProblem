package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    private Coordinate getOrigin() {

        return new Coordinate(0, 0);
    }

    public Coordinate getFourFour() {
        return new Coordinate(4, 4);
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
        rover.move();
        assertEquals(new Coordinate(-2, 0), rover.move());
    }

    @Test
    void givenRover_WhenMove_ThenShouldAbleMoveOneStepInEastDirection() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
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
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 0), Direction.West, plateau);
        assertEquals(new Coordinate(0, 0), rover.move());

    }

    @Test
    void givenRover_WhenMove_ThenShouldThrowException() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 4), Direction.North, plateau);
//        assertEquals(new Coordinate(0, 5), rover.move());
        assertThrows(RoverDeadException.class, () -> rover.move());
    }

    @Test
    void givenRoverWithOneXCoordinateAndOneYCoordinate_WhenMove_ThenShouldReturnFalse() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 1), Direction.North, plateau);
        assertEquals(new Coordinate(1, 2), rover.move());
    }

    //is without dead test
    @Test
    void givenRover_WhenMove_ThenMove() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 4), Direction.North, plateau);
        assertThrows(RoverDeadException.class, () -> rover.move());
        assertThrows(RoverDeadException.class, () -> rover.move());
        //1st
    }

    //wrong test case?
    @Test
    void givenRover_WhenMove_ThenMove1() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 4), Direction.North, plateau);
        assertThrows(RoverDeadException.class, () -> rover.move());
//        assertEquals(new Coordinate(2,5),rover.move());
        assertThrows(RoverDeadException.class, () -> rover.move());
    }

    @Test
    void givenDeadRoverFacingAtNorth_WhenMove_ThenThrowException() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(1, 4), Direction.North, plateau);
        assertThrows(RoverDeadException.class, () -> rover.move());
        assertThrows(RoverDeadException.class, () -> rover.move());
        //error at 119 does not throw any exception(in rover
    }

    @Test
    void givenDeadRoverFacingAtEast_WhenMove_ThenThrowException() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(4, 1), Direction.East, plateau);
        assertThrows(RoverDeadException.class, () -> rover.move());
        assertThrows(RoverDeadException.class, () -> rover.move());
    }

}

@Nested
class DirectionTest {

    private Coordinate getOrigin() {

        return new Coordinate(0, 0);
    }

    private Coordinate getFourFour() {
        return new Coordinate(4, 4);
    }

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
    void givenRoverFacingAtNorthDirection_WhenTurnRight_ThenShouldAbleToTurnToEast() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingNorth());
        assertEquals(Direction.East, rover.turnRight());
    }

    @Test
    void givenRoverFacingAtNorthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingNorth());
        assertEquals(Direction.West, rover.turnLeft());
    }


    @Test
    void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToEast() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingSouth());
        assertEquals(Direction.East, rover.turnLeft());
    }

    @Test
    void givenRoverFacingAtSouthDirection_WhenTurnLeft_ThenShouldAbleToTurnToWest() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingSouth());
        assertEquals(Direction.West, rover.turnRight());
    }


    @Test
    void givenRoverFacingAtEastDirection_WhenTurnRight_ThenShouldAbleToTurnToSouth() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingEast());
        assertEquals(Direction.South, rover.turnRight());
    }

    @Test
    void givenRoverFacingAtEastDirection_WhenTurnRight_ThenShouldAbleToTurnToNorth() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingEast());
        assertEquals(getRoverFacingNorth(), rover.turnLeft());
    }

    @Test
    void givenRoverFacingAtWestDirection_WhenTurnRight_ThenShouldAbleToTurnToNorth() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingWest());
        assertEquals(getRoverFacingNorth(), rover.turnRight());
    }

    @Test
    void givenRoverFacingAtWestDirection_WhenTurnLeft_ThenShouldAbleToTurnToSouth() throws Exception {
        Rover rover = new Rover(getOrigin(), getRoverFacingWest());
        assertEquals(Direction.South, rover.turnLeft());
    }

    @Test
    void givenRover_WhenTurnRight_ThenShouldBeAbleToTurnSouth() throws RoverDeadException {
        Rover rover = new Rover(new Coordinate(1, 1), getRoverFacingNorth(), new Plateau(getOrigin(), getFourFour()));
        rover.turnRight();
        rover.turnRight();
        assertEquals(new Coordinate(1, 0), rover.move());

    }

    @Test
    void givenRoverFacingAtNorthDirection_WhenTurnLeft_ThenShouldBeAbleToTurnSouth() throws RoverDeadException {
        Rover rover = new Rover(new Coordinate(1, 1), getRoverFacingNorth(), new Plateau(getOrigin(), getFourFour()));
        rover.turnLeft();
        rover.turnLeft();
        assertEquals(new Coordinate(1, 0), rover.move());

    }

    @Test
    void givenRoverFacingAtNorthDirection_WhenMove_ThenShouldMove() throws RoverDeadException {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover rover = new Rover(new Coordinate(0, 1), Direction.North, plateau);
        rover.move();
        rover.move();
        assertEquals(new Coordinate(0, 4), rover.move());
        rover.turnLeft();
        assertEquals(new Coordinate(-1, 4), rover.move());
        rover.turnLeft();
        assertEquals(new Coordinate(-1, 3), rover.move());

    }
}

