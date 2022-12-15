public class PairUtil
{
   public static <E extends Comparable> Pair<E, E> minmax(E[] a)
   {
      if (a.length == 0) return null;
      
      E min = a[0];
      E max = a[0];
      
      for (E element : a)
      {
         if (element.compareTo(min) < 0)
            min = element;
         if (element.compareTo(max) > 0)
            max = element;
      }
      
      return new Pair<E, E>(min, max);
   }
}
