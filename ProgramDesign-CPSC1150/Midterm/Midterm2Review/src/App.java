import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array = {"a", "b", "c", "d"};
        int shift = 27;
        rotateArray(array, shift);
        System.out.println(Arrays.toString(array));
        inverseArray(array);
        String[] breakfast = {"ham", "egg", "coffe", "milk", "jam"};
        rotateArray(breakfast, shift);
    }
    private static void rotateArray(String[] array, int shift)
    {
        String temp = array[0];
        if(shift > array.length)
        {
            shift = shift % array.length;
        }
        else
        {
            shift = shift;
        }
        for(int i = 0; i < shift;i++)
        {
            array[i] = array[i+1];
        }
        array[shift] = temp;
    }
    private static void inverseArray(String[] array)
    {
        String temp;
        for(int i = 0; i < array.length/2;i++)
        {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
