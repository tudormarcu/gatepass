import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestFive {
    FestivalGate gate = new FestivalGate();
    @Test
    public void testWhenAddOneOneDayTicket() {
        TicketType ticketType = TicketType.ONEDAY;
        gate.addAttendee(ticketType);
        assertEquals(gate.getOneDayTicket(), 1);
    }
    @Test
    public void testWhenAddTwoOneDayTickets() {
        TicketType ticketType1 = TicketType.ONEDAY;
        TicketType ticketType2 = TicketType.ONEDAY;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        assertEquals(gate.getOneDayTicket(), 2);
    }
    @Test
    public void testWhenAddThreeOneDayTickets() {
        TicketType ticketType1 = TicketType.ONEDAY;
        TicketType ticketType2 = TicketType.ONEDAY;
        TicketType ticketType3 = TicketType.ONEDAY;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getOneDayTicket(), 3);
    }
    @Test
    public void testWhenAddFourOneDayTickets() {
        TicketType ticketType1 = TicketType.ONEDAY;
        TicketType ticketType2 = TicketType.ONEDAY;
        TicketType ticketType3 = TicketType.ONEDAY;
        TicketType ticketType4 = TicketType.ONEDAY;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        assertEquals(gate.getOneDayTicket(), 4);
    }
    @Test
    public void testWhenAddFiveOneDayTickets() {
        TicketType ticketType1 = TicketType.ONEDAY;
        TicketType ticketType2 = TicketType.ONEDAY;
        TicketType ticketType3 = TicketType.ONEDAY;
        TicketType ticketType4 = TicketType.ONEDAY;
        TicketType ticketType5 = TicketType.ONEDAY;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getOneDayTicket(), 5);
    }
}
