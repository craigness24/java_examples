import java.util.concurrent.*;

public class ExecutorTest {

   class Runner implements Runnable {
      private int sleepTime;
      private int threadNum;

      public Runner(int threadNum, int sleepTime) {
         this.threadNum = threadNum;
         this.sleepTime = sleepTime;
      }

      @Override
      public void run() {
         Thread.currentThread().setName("Thread name: " + this.threadNum);
         System.out.println("Thread " + Thread.currentThread().getName() + " sleeping... "
                            + this.sleepTime);
            try {
               Thread.sleep(this.sleepTime); 
               System.out.println("Thread " + this.threadNum + " done sleeping.");
            } catch (InterruptedException ie) {
               System.out.println("Thread " + this.threadNum  + "interrupted... ");
            }
      }

      public int getSleepTime() {
         return this.sleepTime;
      }

      public int getThreadNum() {
         return this.threadNum;
      }
   }

   public static void main(String[] args) {
      ExecutorTest t = new ExecutorTest();
      ExecutorService ex = Executors.newFixedThreadPool(2);

      ex.execute(t.new Runner(1, 2000));
      ex.execute(t.new Runner(2, 1000));
      ex.execute(t.new Runner(3, 8000));
      ex.execute(t.new Runner(4, 3000));
      ex.execute(t.new Runner(5, 2000));

      ex.shutdown();
   }

}
