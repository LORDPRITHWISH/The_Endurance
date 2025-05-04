import java.util.Scanner;

class Timer implements Runnable{

    private final int seconds, delay;


    public Timer(int seconds, int delay) {
        this.seconds = seconds;
        this.delay = delay*100;
    }

    public Timer(int seconds) {
        this.seconds = seconds;
        this.delay = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            for (int i = seconds; i > 0 ; i--) {
                Thread.sleep(1000);
                System.out.println(i+" seconds left");
            }
            System.out.println("Time's up!");
            System.exit(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class Threader {
    public static void main(String[] args) {

        Timer timer = new Timer(10);
        Thread thread = new Thread(timer);
        thread.setDaemon(true);
        thread.start();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");

        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

    }
}
