import java.util.Scanner;

public class MultiThreader {
    public static void main(String[] args) {


        Thread[] threadList = new Thread[5];

        for (int i = 0; i < threadList.length; i++) {
            Timer timer = new Timer(10, i);
            threadList[i] = new Thread(timer);
            threadList[i].setDaemon(true);
            threadList[i].start();


        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
