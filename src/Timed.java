import java.util.Timer;
import java.util.TimerTask;

public class Timed {
    public static void main(String[] args) {
        // Create a new instance of the Timer class
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int i = 10;
            @Override
            public void run() {
                // This method will be called when the timer expires
                if(i == 0) {
                    System.out.println("The Darkness is HERE NOW! Flee!");
                    // Cancel the timer
                    timer.cancel();
                }
                else
                    System.out.println("The Darkness is coming in " + i-- + " seconds");
                // Cancel the timer

            }
        };

        timer.schedule(task, 100,1000);



    }
}
