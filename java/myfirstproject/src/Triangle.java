import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the sides of your triangle ");
        double a, b, c, Perimeter, s, Area;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        Perimeter = a + b + c;
		s = (a + b + c)/2; // Perimeter/2
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


		System.out.format("\n The Perimeter of Traiangle = %.2f\n", Perimeter);
		System.out.format("\n The Semi Perimeter of Traiangle = %.2f\n",s);
		System.out.format("\n The Area of triangle = %.2f\n",Area);
    }
}
