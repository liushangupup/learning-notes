package review.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiushangRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("hello liushang");
    }

    public static void main(String[] args) {
        new Thread(new LiushangRunnable()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello liushang1");
            }
        }).start();
        new Thread(()-> System.out.println("hello liushang2")).start();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new LiushangRunnable());
    }
}
