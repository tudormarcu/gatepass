package ro.homework.gatepass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ro.homework.gatepass.TicketType.*;

public class FestivalGate {
    List<TicketType> attendeeList = new ArrayList<>();

    public FestivalGate() {

    }

    public void addAttendee(TicketType ticketType) {

        attendeeList.add(ticketType);
    }

    public void printTicketsNumber() {
        System.out.println("\n________________Ticket Type Statistics________________");
        System.out.println("*All tickets: " + attendeeList.size() + "\n");
        System.out.println("- Full tickets: " + Collections.frequency(attendeeList, TicketType.FULL));
        System.out.println("- Full-vip tickets: " + Collections.frequency(attendeeList, FULLVIP));
        System.out.println("- FreePass tickets: " + Collections.frequency(attendeeList, FREEPASS));
        System.out.println("- One-day tickets: " + Collections.frequency(attendeeList, ONEDAY));
        System.out.println("- One-day-vip tickets: " + Collections.frequency(attendeeList, ONEDAYVIP));
        System.out.println("______________________________________________________\n");
    }


    public Object getCount() {

        return attendeeList.size();
    }

    public int getFullTicket() {

        return Collections.frequency(attendeeList, FULL);
    }

    public int getFullVipTicket() {
        return Collections.frequency(attendeeList, FULLVIP);
    }

    public int getFreePassTicket() {

        return Collections.frequency(attendeeList, FREEPASS);
    }

    public int getOneDayTicket() {
        return Collections.frequency(attendeeList, ONEDAY);
    }

    public int getOneDayVipTicket() {
        return Collections.frequency(attendeeList, ONEDAYVIP);
    }
}
