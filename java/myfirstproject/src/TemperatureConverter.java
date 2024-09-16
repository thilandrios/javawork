import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature in commie units:");
        double c;
        double f;
        c = input.nextDouble();
        f = (1.8*c)+32;
        System.out.println("The temperature in freedom units is: " + f);
        

    }    
}
