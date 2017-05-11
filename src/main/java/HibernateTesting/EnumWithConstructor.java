package HibernateTesting;

public enum EnumWithConstructor
{
   Member1(1), Member2(2);

   private int i;

   EnumWithConstructor(int i)
   {
      this.i = i;
   }

   public int getI()
   {
      return i;
   }
}
