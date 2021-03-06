package streamv3.homework;

import java.util.Random;

public class Factory extends Thread {

    private static final Random RANDOM = new Random();

    private Dump dump;
    private Night night;

    public Factory(Dump dump, Night night) {
        this.dump = dump;
        this.night = night;
    }

    @Override
    public void run() {
        while (night.getNight() < 100) {
            synchronized (dump) {
                int randomValue = 1 + RANDOM.nextInt(4);
                if (night.getNight() == 0) {
                    randomValue = randomValue + 20;
                }
                for (int i = 0; i <= randomValue; i++) {
                    RobotDetails robotDetails = RandomRobotDetails.getRandomDetails();
                    dump.discardRobotDatailsOnDump(robotDetails);
                }
                try {
                    dump.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dump.notifyAll();
                night.setNight(1);
            }
        }
    }
}