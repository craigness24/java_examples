public class FibTest {

   public static void main(String[] args) {
      // 1, 1, 2, 3, 5, 8
      for (int i = 0; i <= 50; i++)
         System.out.println("Fib value for elem " + i + " = " + fib(i));
   }

   private static long fib(int elem) {
      if (elem == 0)
         return 0;

      if (elem == 1)
         return 1;

      return fib(elem - 1) + fib(elem - 2);
   }

}
