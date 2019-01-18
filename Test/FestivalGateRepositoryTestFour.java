import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestFour {
    FestivalGate gate = new FestivalGate();

    @Test
    public void testWhenAddOneFreePassTicket() {
        TicketType ticketType = TicketType.FREEPASS;
        gate.addAttendee(ticketType);
        assertEquals(gate.getFreePassTicket(), 1);
    }
    @Test
    public void testWhenAddTwoFreePassTickets() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FREEPASS;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        assertEquals(gate.getFreePassTicket(), 2);
    }
    @Test
    public void testWhenAddThreeFreePassTickets() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FREEPASS;
        TicketType ticketType3 = TicketType.FREEPASS;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getFreePassTicket(), 3);
    }
    @Test
    public void testWhenAddFouFreePassTickets() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FREEPASS;
        TicketType ticketType3 = TicketType.FREEPASS;
        TicketType ticketType4 = TicketType.FREEPASS;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        assertEquals(gate.getFreePassTicket(), 4);
    }
    @Test
    public void testWhenAddFiveFreePassTickets() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FREEPASS;
        TicketType ticketType3 = TicketType.FREEPASS;
        TicketType ticketType4 = TicketType.FREEPASS;
        TicketType ticketType5 = TicketType.FREEPASS;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getFreePassTicket(), 5);
    }
}
