package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    void givenCoordinate_WhenCheckIsSameOrNot_ThenShouldReturnTrue()
    {
        Coordinate coordinate=new Coordinate(0,0);
        Assertions.assertTrue(coordinate.isSame(0,0));
    }

}