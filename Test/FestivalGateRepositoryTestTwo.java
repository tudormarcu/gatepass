import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestTwo {
    FestivalGate gate = new FestivalGate();

    @Test
    public void testWhenAddOneFullTicket() {
        TicketType ticketType = TicketType.FULL;
        gate.addAttendee(ticketType);
        assertEquals(gate.getFullTicket(), 1);
    }
    @Test
    public void testWhenAddTwoFullTickets() {
        TicketType ticketType1 = TicketType.FULL;
        TicketType ticketType2 = TicketType.FULL;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        assertEquals(gate.getFullTicket(), 2);
    }
    @Test
    public void testWhenAddThreeFullTickets() {
        TicketType ticketType1 = TicketType.FULL;
        TicketType ticketType2 = TicketType.FULL;
        TicketType ticketType3 = TicketType.FULL;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getFullTicket(), 3);
    }
    @Test
    public void testWhenAddFourFullTickets() {
        TicketType ticketType1 = TicketType.FULL;
        TicketType ticketType2 = TicketType.FULL;
        TicketType ticketType3 = TicketType.FULL;
        TicketType ticketType4 = TicketType.FULL;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        assertEquals(gate.getFullTicket(), 4);
    }
    @Test
    public void testWhenAddFiveFullTickets() {
        TicketType ticketType1 = TicketType.FULL;
        TicketType ticketType2 = TicketType.FULL;
        TicketType ticketType3 = TicketType.FULL;
        TicketType ticketType4 = TicketType.FULL;
        TicketType ticketType5 = TicketType.FULL;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getFullTicket(), 5);
    }
}
