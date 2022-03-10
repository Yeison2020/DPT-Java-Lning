package Example01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Age {
    public static void main(String[] args) throws IOException{
        InputStreamReader captureTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(captureTeclado);
        System.out.println("Enter your age here Please:");
        String strAge = buffer .readLine();

        // Here converting age to Number;
        Integer age = Integer.parseInt(strAge);
        System.out.println("Hello "+  age);
    
        }
    
}
