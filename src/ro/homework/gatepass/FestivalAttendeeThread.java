package ro.homework.gatepass;

public class FestivalAttendeeThread implements Runnable {
    FestivalGate gate;
    private TicketType ticketType;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        gate.addAttendee(ticketType);
        System.out.println("Attendee with " + ticketType + " ticket entered");
    }
}



