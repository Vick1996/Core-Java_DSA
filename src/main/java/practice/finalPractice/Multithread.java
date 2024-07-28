package practice.finalPractice;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Multithread implements Runnable
{
    @Override
    public void run()
    {

    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.start();
        t2.start();
        t3.start();

        BlockingDeque bq = new LinkedBlockingDeque(10);

    }


}
