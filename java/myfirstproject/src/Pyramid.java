import java.util.Scanner;
public class Pyramid {
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number, any number");
        byte number = input.nextByte();

        if (number >= 2 && number <= 15){
            for(byte row = 1; row <= number; row++){
                for(byte whiteSpace = (byte) (number - row); whiteSpace > 0; whiteSpace--){
                    System.out.print("  ");
                }
                for(byte triangle2 = row; triangle2 > 0; triangle2--){
                    System.out.print(triangle2 + " ");

                }
                for(byte triangle3 = 2; triangle3 <= row; triangle3++){
                    System.out.print(triangle3 + " ");
                }
                System.out.println();
            }
        } 
        else {
            System.out.print("Sorry, I can't build that pyramid");
        }
    }
}
