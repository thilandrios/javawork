package src;
import java.util.Scanner;
import java.util.Random;
public class Whileloop {
    public static void main(String[] args) {
        Random num = new Random();
        int number = 1+num.nextInt(2);
        int yg;
        System.out.println("Guess what number was generated");
        Scanner g = new Scanner(System.in);
        yg = g.nextInt();

        do{
            System.out.println("You guessed correct!");
        }
        while(yg == number);
        do{
            System.out.println("Wrong!!!");
        }while(yg != number);



}
}
