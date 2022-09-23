public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // reference refers to the location of an objects
        // the new operator returns a reference to a new object
        int[] arr1 = {1, 2, 3, 4};
        // arr1 has an address
        int[] arr2 = arr1;
        // arr2 is also pointing to the object {}
        arr2[2] = 200;
        System.out.println(arr1[2]); 
        //
        int[] arr3 = {4, 2, 10};
        arr3 = arr1;

    }
}
