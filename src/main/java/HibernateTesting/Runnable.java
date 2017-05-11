package HibernateTesting;

import com.google.common.base.Function;
import com.google.common.collect.BiMap;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runnable
{
   public static void main(String[] args) throws InterruptedException
   {
//      List<Integer> list = new ArrayList<Integer>();
//      list.add(1);
//      list.add(2);
//      list.add(3);
//      Collection<Integer> unmod = Collections.unmodifiableCollection(new ArrayList<Integer>(list));
//      list.add(4);
//
//      System.out.println("list:");
//      for (Integer i : list)
//      {
//         System.out.println(i);
//      }
//
//      System.out.println();
//
//      System.out.println("unmod:");
//      for (Integer i : unmod)
//      {
//         System.out.println(i);
//      }
//      MyRandom generator =  new MyRandom();
//      Random generator2 = new Random();
//      System.out.println(generator.getPositiveRandomInt());
//      System.out.println(generator2.nextInt(20));

//      int [][][] arr = {{{1,2},{3}}};
//      arr[0][2] = 42;
//      System.out.println(arr[0][0][1]);

//      String temp = "abc;def";
//      String[] strings = temp.split(";");
//      for (String current : strings)
//      {
//         System.out.println(current);
//      }

//      DateTime dt = new DateTime();
//      System.out.println(dt);
//      DateTime dateTime = new DateTime(2017, 3, 21, 15, 00, 46, 463);
//      new DateTimeZone()
//      System.out.println(dateTime);
//
////      dt = new DateTime();
//      String[] dateTimeStrings = dt.toString().split("T");
//      String[] date = dateTimeStrings[0].split("-");
//      String[] time = dateTimeStrings[1].split(":");
//      String[] secondsAndMillis = time[2].split("\\.");
//      for (String i : secondsAndMillis)
//      {
//         System.out.println(i);
//      }
//      System.out.println(secondsAndMillis.length);
//      String millisValue = secondsAndMillis[1].substring(0, 2);
//
//      int year = Integer.parseInt(date[0]);
//      int month = Integer.parseInt(date[1]);
//      int day = Integer.parseInt(date[2]);
//
//      int hours = Integer.parseInt(time[0]);
//      int minutes = Integer.parseInt(time[1]);
//      int seconds = Integer.parseInt(secondsAndMillis[0]);
//      System.out.println("year=" + year);
//      System.out.println("month=" + month);
//      System.out.println("day=" + day);
//      System.out.println("hours=" + hours);
//      System.out.println("minutes=" + minutes);
//      System.out.println("seconds=" + seconds);
//      int millis = Integer.parseInt(millisValue);
//      dateTime = new DateTime(year, month, day, hours, minutes, seconds, millis);
//      System.out.println(dateTime);
//
//      System.out.println(Integer.parseInt("003"));
//

//      String str="<actions>::=<action><action>|X|<game>|alpha";
//      str=str.split("=")[1];
//      Pattern pattern = Pattern.compile("<.*?>|\\|.*?\\|");
//      Matcher matcher = pattern.matcher(str);
//      while (matcher.find()) {
//         System.out.println(matcher.group());
//      }
//      String a = "^[a-z0-9_-]{3,15}$";
//      String regex = "^[0-9]{3}[a-z]{3}[0-9]{3}$";
////      re = "[0-9a-z]";
//      String qwe = "[a-z]";
//      String sample = "123abc456";
//      String sample = "23413abadc456";
//      Pattern pattern = Pattern.compile("[0-9]");
//      Matcher matcher = pattern.matcher(sample);
//      while (matcher.find()) {
//         System.out.println(matcher.group());
//      }
//
//      System.out.println(new DateTime());
//      System.out.println(Arrays.deepToString(sample.split(qwe)));
//      for (String i : sample.split(qwe))
//      {
//         System.out.println(i);
//      }
//      System.out.println("[abc]");

//      System.out.println(true&&false);

//      String str1 = "EQUALS";
//      String str2 = "EQUALS";
//      System.out.println(str1.equals(str2));

//      String s = null;
//      if (s != null && s.equals("123"))
//      {
//         System.out.println("Privet!!!");
//      }

//      System.out.println(Runnable.getResult(2));

//      TestStaticThread thread = new TestStaticThread();
//      Thread t = new Thread(thread);
//      t.start();
////      Thread.sleep(1000);
//      System.out.println(Thread.currentThread().getName() + "i=" + B.i);

//      Map<String, Integer> mapping = new HashMap<String, Integer>();
//      mapping.put("one", new Integer(1));
//      mapping.put("one", new Integer(2));
//      System.out.println(mapping.get("one"));

//      BiMap<String, Integer> newMapping = HashBiMap.create(mapping);
//      Map<Integer, String> newMapping2 = HashBiMap.create(mapping).inverse();
//      System.out.println(newMapping.get("one"));
//      System.out.println(newMapping.inverse().get(new Integer(1)));
//      System.out.println(newMapping.get("one"));
//      System.out.println(newMapping.get(new Integer(1)));
//      System.out.println(newMapping2.get(1));

//      if (false && true)
//      {
//         System.out.println("Daaaaa");
//      }
//
//      String str = "";
//      ArrayList<?> sr = new ArrayList<String>();
//      sr.add((Object)str);


//      Iterable<C> values = FluentIterable.of(new C(1), new C(2), new C(3));
//      Map<Integer, C> mapping = HashBiMap.create(Maps.toMap(values, qwe)).inverse();
//      System.out.println(mapping.get(3));

//      DateTime time1 = new DateTime();
//      DateTime time2 = new DateTime();
//      System.out.println(time1.minus(time2.plus(10000000000L).getMillis()).getMillis());

//      System.out.println(1232622323/(1000000));

//      List<Object> a = new ArrayList<Object>();

      System.out.println(EnumWithConstructor.Member2.getI());
//      EnumWithConstructor a = new EnumWithConstructor(2);
      System.out.println(EnumWithConstructor.Member2.toString());
      Duration
   }

   public static Function<C, Integer> qwe = new Function<C, Integer>()
   {
      public Integer apply(C input)
      {
         return input.i;
      }
   };

   static int getResult(int switcher)
   {
      switch (switcher)
      {
         case 1:
            return 1;

         case 2:
            return 2;

         case 3:
            return 3;

         default:
            throw new IllegalArgumentException();
      }
   }

   private static class MyRandom extends Random
   {
      public int getPositiveRandomInt()
      {
         return super.next(Integer.SIZE - 1);
      }
   }
}

class B
{
   public static int i = 1;
}