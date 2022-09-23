import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(romanToInt("VC"));
    }
    public static int romanToInt(String s){
         /*
        largest to smallest: add them up
        smaller before larger: subtract smaller
        */
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // set the initial value to the value of the last character
        int result = map.get(s.charAt((s.length() - 1)));
        // loops the string except the last char
        for(int i = s.length()-2; i >= 0 ; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
