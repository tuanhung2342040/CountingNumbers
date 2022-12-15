public class PairUtil
{
   // generic method
   public static <E extends Measurable> Pair<E, E> minmax(E[] a)
   {
      if (a.length == 0) return null;
      
      E min = a[0];
      E max = a[0];
      
      for (E element : a)
      {
         if (element.getMeasure() < min.getMeasure())
            min = element;
         if (element.getMeasure() > max.getMeasure())
            max = element;
      }
      
      return new Pair<E, E>(min, max);
   }
}
