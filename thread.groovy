 Runnable task= ()->
 {
     try 
     {
     String threadName =Thread.currentThread().getName();
     println("Foo  "+threadName);
     sleep(1000);
     println("Bar "+threadName);
     }
     catch(InterruptedException e)
     {
         e.printStackTrace();
     }
 }
Thread thread = new Thread(task);
thread.start();
