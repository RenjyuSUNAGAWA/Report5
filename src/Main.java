//import java.io.IOException;

public class Main {
    public static void main(String[] args){ //throws Exception {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullpoiterException occurred.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
