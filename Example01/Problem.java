package Example01;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Problem {
    public static void main(String[] args) throws IOException{
        System.out.println("Welcome to Numbers here start");
        InputStreamReader capture_Value = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capture_Value);



        System.out.println("Add Your first Number");
        String strNumber1 = buffer.readLine();
        Integer number1 = Integer.parseInt(strNumber1);



        System.out.println("Add Your second Number here");
        String strNumber2 = buffer.readLine();
        Integer number2 = Integer.parseInt(strNumber2);


        
        System.out.println("Add Your third Number here");
        String strNumber3 = buffer.readLine();
        Integer number3 = Integer.parseInt(strNumber3);







    }
    
}
