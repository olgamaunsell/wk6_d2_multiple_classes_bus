import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Bus bus2;
    Person person;
    Person person2;

    @Before

    public void before(){
        bus = new Bus(30);
        bus2 = new Bus(1);
        person = new Person();

    }
//
//    @Test
//
//    public void hasDestination(){
//        assertEquals("Elm Row", bus.getDestination());
//    }

    @Test

    public void hasCapacity(){
        assertEquals(30, bus.getCapacity());
    }


    @Test

    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
       int passengerCountBefore = bus.passengerCount();
       bus.addPassenger(person);
       assertEquals(passengerCountBefore+1, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfPassengerCountLessThanCapacity(){
        int passengerCountBefore = bus.passengerCount();
        bus.addPassenger(person);
        assertEquals(passengerCountBefore+1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengerIfBusFull(){
        int passengerCountBefore = bus2.passengerCount();
        bus2.addPassenger(person);
        bus2.addPassenger(person2);
        assertEquals(passengerCountBefore+1, bus2.passengerCount());
    }

    @Test

    public void removePassengerReducesPassengerCount(){
        bus.addPassenger(person);
        bus.addPassenger(person2);
        int passengerCountBefore = bus.passengerCount();
        bus.removePassenger();
        assertEquals(passengerCountBefore-1, bus.passengerCount());

    }
}
