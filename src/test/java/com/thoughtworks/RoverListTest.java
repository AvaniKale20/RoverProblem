//package com.thoughtworks;
//
//import com.thoughtworks.exception.RoverDeadException;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class RoverListTest {
//    @Test
//    void givenFirstOneRover_WhenMove_ThenShouldMove() throws RoverDeadException {
//        Plateau plateau=new Plateau(new Coordinate(0,0),new Coordinate(4,4));
//        Rover roverOne = new Rover(new Coordinate(1, 1), Direction.North,plateau);
//        List<Rover> list = new ArrayList<>();
//        list.add(roverOne);
//        assertEquals(new Coordinate(1, 2), roverOne.move());
//        RoverList roverList = new RoverList(list);
//        roverList.check();
//
//
//    }
//}
