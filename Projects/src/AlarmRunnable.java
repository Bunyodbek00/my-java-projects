import java.time.LocalTime;
import java.util.Scanner;

public class AlarmRunnable implements Runnable {

    private final LocalTime alarmTime;
    private final Scanner scanner;

    AlarmRunnable(LocalTime alarmTime, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        System.out.println("Alarm set! Current time:");
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\nWAKE UP! WAKE UP! WAKE UP!");
        System.out.print("Press *Enter* to dismiss the alarm: ");
        scanner.nextLine();
        scanner.close();
        System.out.println("Alarm dismissed. Have a great day!");
    }
}
