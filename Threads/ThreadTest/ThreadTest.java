public class ThreadTest {

   class InnerThread extends Thread {

      private String name;

      public InnerThread(String name) {
         this.name = name;
      }

      @Override
      public void run() {
         System.out.println("Thread running: " + name);
      }

   }


   public static void main(String[] args) throws InterruptedException {
      ThreadTest tt = new ThreadTest();
      ThreadTest.InnerThread thread1 = tt.new InnerThread("1");
      ThreadTest.InnerThread thread2 = tt.new InnerThread("2");
      ThreadTest.InnerThread thread3 = tt.new InnerThread("THIRD");

      Runnable runner = new Runnable() {
         @Override
         public void run() {
            System.out.println("Message from runnable!");
         }
      };
      Thread thread4 = new Thread(runner);
      thread1.start();      
      thread2.start();
      thread3.start();
      thread4.start();
      
      System.out.println("In the middle!"); 

      thread1.join();
      thread2.join();
      thread3.join(); 
      thread4.join();
 
      System.out.println("Done!"); 
   }

}
