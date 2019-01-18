import org.junit.Test;
import ro.homework.gatepass.FestivalGate;
import ro.homework.gatepass.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateRepositoryTestSix {
    FestivalGate gate = new FestivalGate();
    @Test
    public void testWhenAddOneOneDayVipTicket() {
        TicketType ticketType = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType);
        assertEquals(gate.getOneDayVipTicket(), 1);
    }
    @Test
    public void testWhenAddTwoOneDayVipTickets() {
        TicketType ticketType1 = TicketType.ONEDAYVIP;
        TicketType ticketType2 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        assertEquals(gate.getOneDayVipTicket(), 2);
    }
    @Test
    public void testWhenAddThreeOneDayVipTickets() {
        TicketType ticketType1 = TicketType.ONEDAYVIP;
        TicketType ticketType2 = TicketType.ONEDAYVIP;
        TicketType ticketType3 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        assertEquals(gate.getOneDayVipTicket(), 3);
    }
    @Test
    public void testWhenAddFourOneDayVipTickets() {
        TicketType ticketType1 = TicketType.ONEDAYVIP;
        TicketType ticketType2 = TicketType.ONEDAYVIP;
        TicketType ticketType3 = TicketType.ONEDAYVIP;
        TicketType ticketType4 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        assertEquals(gate.getOneDayVipTicket(), 4);
    }
    @Test
    public void testWhenAddFiveOneDayVipTickets() {
        TicketType ticketType1 = TicketType.ONEDAYVIP;
        TicketType ticketType2 = TicketType.ONEDAYVIP;
        TicketType ticketType3 = TicketType.ONEDAYVIP;
        TicketType ticketType4 = TicketType.ONEDAYVIP;
        TicketType ticketType5 = TicketType.ONEDAYVIP;
        gate.addAttendee(ticketType1);
        gate.addAttendee(ticketType2);
        gate.addAttendee(ticketType3);
        gate.addAttendee(ticketType4);
        gate.addAttendee(ticketType5);
        assertEquals(gate.getOneDayVipTicket(), 5);
    }
}
