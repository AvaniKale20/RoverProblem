package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    void givenOneAndOneCoordinate_WhenCheckIsRight_ThenReturnFalse() {
        Coordinate coordinate = new Coordinate(0, 0);
        Assertions.assertFalse(coordinate.isRight(new Coordinate(1, 1)));
    }


}
