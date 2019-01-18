import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestSeven {
    FestivalGate gate = new FestivalGate();

    @Test
    public void testWhenRandromMultipleTicketsOne() {
        TicketType ticketType1 = TicketType.FULLVIP;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.ONEDAY;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getCount(), 3);
        assertEquals(gate.getFullVipTicket(), 2);
        assertEquals(gate.getOneDayTicket(), 1);
    }
    @Test
    public void testWhenRandromMultipleTicketsTwo() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.ONEDAY;
        TicketType ticketType4 = TicketType.ONEDAY;
        TicketType ticketType5 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getCount(), 5);
        assertEquals(gate.getFreePassTicket(), 1);
        assertEquals(gate.getFullVipTicket(), 1);
        assertEquals(gate.getOneDayTicket(), 2);
        assertEquals(gate.getOneDayVipTicket(), 1);
    }
    @Test
    public void testWhenRandromMultipleTicketsThree() {
        TicketType ticketType1 = TicketType.FREEPASS;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.ONEDAY;
        TicketType ticketType4 = TicketType.FULL;
        TicketType ticketType5 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getCount(), 5);
        assertEquals(gate.getFreePassTicket(), 1);
        assertEquals(gate.getFullVipTicket(), 1);
        assertEquals(gate.getFullTicket(), 1);
        assertEquals(gate.getOneDayTicket(), 1);
        assertEquals(gate.getOneDayVipTicket(), 1);
    }
}
