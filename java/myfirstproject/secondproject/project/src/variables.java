package src;
import java.util.Scanner;
public class variables {
    public static void main(String s[]) {
        int x = 17;
        double a = 100000000.5;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter either a character or a number");
        String b = myInput.nextLine();
        System.out.println("The value of the input you gave is " + b);


        if (x < 18 ) {
            System.out.println("Sorry, you are not old enough to vote");
        } else {
            System.out.println("Right this way, of age voter person");
        }
        if (a == 0){
            System.out.println("Zero");
        }
        else if(a < -0){
            System.out.print("small negative");
        }
        else if(a > 100000000){
            System.out.println("Large positive");
        }
        else{
            System.out.println("small positive");
        }
        if(!s.equals(1)){
            System.out.println("Error");
        }
        

    }
}
