package ro.homework.gatepass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long maxAttendeeNumber = 40000;
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(gate);
        Thread t1 = new Thread(festivalStatisticsThread);
        t1.start();
        for (int x = 0; x < maxAttendeeNumber; x++) {
            TicketType ticketType = TicketType.getRandom();
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            Thread t2 = new Thread(festivalAttendee);
            t2.start();
            t2.sleep(500);
        }
    }
}
