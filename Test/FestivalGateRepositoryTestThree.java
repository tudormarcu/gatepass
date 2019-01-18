import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestThree {
    FestivalGate gate = new FestivalGate();

    @Test
    public void testWhenAddOneFullVipTicket() {
        TicketType ticketType = TicketType.FULLVIP;
        gate.addAttendee(ticketType);
        assertEquals(gate.getFullVipTicket(), 1);
    }
    @Test
    public void testWhenAddTwoFullVipTickets() {
        TicketType ticketType1 = TicketType.FULLVIP;
        TicketType ticketType2 = TicketType.FULLVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        assertEquals(gate.getFullVipTicket(), 2);
    }
    @Test
    public void testWhenAddThreeFullVipTickets() {
        TicketType ticketType1 = TicketType.FULLVIP;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.FULLVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getFullVipTicket(), 3);
    }
    @Test
    public void testWhenAddFourFullVipTickets() {
        TicketType ticketType1 = TicketType.FULLVIP;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.FULLVIP;
        TicketType ticketType4 = TicketType.FULLVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        assertEquals(gate.getFullVipTicket(), 4);
    }
    @Test
    public void testWhenAddFiveFullVipTickets() {
        TicketType ticketType1 = TicketType.FULLVIP;
        TicketType ticketType2 = TicketType.FULLVIP;
        TicketType ticketType3 = TicketType.FULLVIP;
        TicketType ticketType4 = TicketType.FULLVIP;
        TicketType ticketType5 = TicketType.FULLVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getFullVipTicket(), 5);
    }
}
