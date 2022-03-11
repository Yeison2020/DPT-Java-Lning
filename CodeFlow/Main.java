

public class Main {

    Integer NUMBER = 100;

    public static void main(String[] args){
        String result = "";

        int counter = 0;
        int number = 1;

        while(counter <= 100){
            if(printingNumber(counter)){
                result += number + ", ";
            }

        }

    };


    public static Boolean printingNumber(Integer number){
        Boolean startedValue = true;
        for(int i = 2; i <=  number; i++){
            if(number % i == 0){
                startedValue = true;
            } else {
               startedValue = false;

            } 
        }

        return startedValue;
    }



    
}