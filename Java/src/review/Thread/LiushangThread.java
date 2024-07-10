package review.Thread;

public class LiushangThread extends Thread{

    @Override
    public void run() {
        System.out.println("hello liushang");
    }

    public static void main(String[] args) {
        new LiushangThread().start();
    }
}
