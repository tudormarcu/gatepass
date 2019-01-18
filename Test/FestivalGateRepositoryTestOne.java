import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestOne {
    FestivalGate gate = new FestivalGate();
    TicketType ticketType = TicketType.getRandom();

    @Test
    public void testWhenAddOneDataToRepository() {
        gate.addAttendee(ticketType);
        assertEquals(gate.getCount(), 1);
    }
    @Test
    public void testWhenAddTwoDataToRepository(){
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        assertEquals(gate.getCount(), 2);
    }
    @Test
    public void testWhenAddThreeDataToRepository(){
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        assertEquals(gate.getCount(), 3);
    }
    @Test
    public void testWhenAddFourDataToRepository(){
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        assertEquals(gate.getCount(), 4);
    }

    @Test
    public void testWhenAddFiveDataToRepository(){
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        gate.addAttendee(ticketType);
        assertEquals(gate.getCount(), 5);
    }
}
