import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius;
        double circumference;
        double area;

        radius = input.nextDouble();
        circumference = 2*Math.PI*radius;
        area = Math.PI*(radius*radius);
        System.out.println("Based off your input the circumference is " + circumference + " and the area is " + radius);

        
    }
}
