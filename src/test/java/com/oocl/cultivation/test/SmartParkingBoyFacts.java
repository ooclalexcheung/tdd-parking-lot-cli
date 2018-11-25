package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class SmartParkingBoyFacts {

    @Test
    void should_select_second_parking_lot() {

        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(2);
        ParkingLotList ParkingLotList = new ParkingLotList(Arrays.asList(parkingLot1, parkingLot2));
        ParkingBoy smartParkingBoy = new SmartParkingBoy(ParkingLotList);

        ParkingLot selectedParkingLot = smartParkingBoy.selectParkingLot().get();

        assertSame(selectedParkingLot, parkingLot2);
    }
    //Given lotlist with different space left, smart boy, car, when park, then should park the car into a place with more space

}
