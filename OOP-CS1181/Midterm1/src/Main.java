import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        //Mul 5
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            arrayList.add(i+3);
        }
        System.out.println(arrayList.get(0));
    }
}
