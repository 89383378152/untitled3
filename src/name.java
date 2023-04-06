
import java.util.Timer;
import java.util.TimerTask;


class CountdownTimer {
    private static int secondsLeft;

    public static void main(String[] args) {
        startCountdownTimer(60); // Введите количество секунд для обратного отсчета
        System.out.println("секундомер запущен");
    }
    private static void startCountdownTimer(int seconds) {
        secondsLeft = seconds;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Seconds Left: " + secondsLeft);
                secondsLeft--;
                if (secondsLeft < 0) {
                    timer.cancel();
                    System.out.println("секундомер закончил отсчет");
                }
            }
        }, 0, 1000);
    }
}