import java.util.Scanner; 

public class RoomPaint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height;
        double width;
        double length;
        double area;
        double gallonsNeeded;
        int doors;
        int windows;
        System.out.println("Please enter the height, width, and length of your room");
        Scanner input2 = new Scanner(System.in);
        System.out.println("And how many doors and windows are there?");
        
        height = input.nextDouble();
        width = input.nextDouble();
        length = input.nextDouble();
        doors = input2.nextInt();
        windows = input2.nextInt();

        area = (length*width*height) - ((doors*20)+(windows*15));
        gallonsNeeded = area/350;
        System.out.println("The total area that needs to be covered is: " + area + " and you will need " + gallonsNeeded + " gallons of paint.");

    }    
}
