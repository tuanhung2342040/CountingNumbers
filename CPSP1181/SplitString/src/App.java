public class App {
    public static void main(String[] args) throws Exception {
       String a= "a\\]b \\[|\\[|\\"; 
       String[] arr = a.split("\\] \\[|\\[|\\]");
       for(String b : arr){
           System.out.println(b);
       }
    }
}
