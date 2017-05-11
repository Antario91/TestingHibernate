package HibernateTesting;

public class TestStaticThread implements java.lang.Runnable
{
   public void run()
   {
      B.i = 25;
      System.out.println(Thread.currentThread().getName() + "i="+B.i);
   }
}
