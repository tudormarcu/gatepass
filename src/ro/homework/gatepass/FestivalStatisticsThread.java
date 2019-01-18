package ro.homework.gatepass;

public class FestivalStatisticsThread implements Runnable {
    FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {

        while (gate.attendeeList != null) {
            try {
                gate.printTicketsNumber();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
