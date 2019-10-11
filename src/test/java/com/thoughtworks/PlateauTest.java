package com.thoughtworks;

import com.thoughtworks.exception.RoverDeadException;
import com.thoughtworks.exception.RoverNotAllowToGoForward;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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

    @Test
    void givenRoverWithFiveXCoordinateAndFiveYCoordinate_WhenCheckHasOutOfBound_ThenReturnTrue() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertTrue(plateau.hasOutOfBound(new Coordinate(5, 5)));
    }

    //Correct
    @Test
    void givenRoverWitOneXCoordinateAndFiveYCoordinate_WhenCheckHasOutOfBound_ThenReturnFalse() {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        assertTrue(plateau.hasOutOfBound(new Coordinate(1, 5)));
    }
    //todo-if we have two rover-

    @Test
    void givenTwoRover_WhenMove_ThenMove() throws Exception {
        Plateau plateau = new Plateau(getOrigin(), getFourFour());
        Rover roverTwo = new Rover(new Coordinate(4, 4), Direction.North, plateau);
        assertThrows(RoverNotAllowToGoForward.class, roverTwo::move);

    }

}

//givenRover_WhenMove_ThenShouldMove() 1st test case ...
//givenRover_WhenMove_ThenShouldThrowExceptions 2nd test case...
//if rover dead at 0,4 coordinate then note down that coordinate -if(Coordinate==(0,4)){rover cant move}

//givenRoverTwo_WhenMove_ThenMove()
//givenRoverTwo_WhenMove_ThenMoveTillThatCoordinate..