import java.util.concurrent.*;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) {
        /*Synmethod synmethod = new Synmethod();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.range(0, 10000)
                .forEach(i -> executorService.submit(synmethod));
                executorService.shutdown();
                synmethod.prints();
        // Semaphore
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(5);
        Runnable runnable = ()->
        {
            boolean permit  = true;
            try{
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println("Semaphore acquired");
                    sleep(2000);
                } else {
                    System.out.println("Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                    if(permit)
                    {
                        semaphore.release();
                    }
            }

        };
        IntStream.range(0,10).forEach(i -> executorService.submit(runnable));
          executorService.shutdown();*/

        //Barrier
        CyclicBarrier barrier = new CyclicBarrier(1, new Runnable() {
            @Override
            public void run() {
                        sleep(1000);
                        String name =Thread.currentThread().getName();
                        println("${name} runing main task");
            }
        });
        barrier.await();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute((()->{
            String name =Thread.currentThread().getName();
            println("${name} runing extra task");

        }));
        executorService.shutdown();
    }

}
