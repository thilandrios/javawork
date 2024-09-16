package src;

import java.util.Scanner; 

public class Game {
	public static void main(String[] args){  

        System.out.println("I am ready to play!");

        Scanner i = new Scanner(System.in);

        System.out.println("What's your age?");

        String userinput = i.nextLine();

        if (userinput == "13"){
            System.out.println("You are allowed to play at your own risk");
        } else {
            System.out.println("Play On!");
		}

        System.out.println("You are at an Iggy concert, and you hear this lyric 'Are you ready?, start running.'");
		System.out.println("Suddenly, Iggy stops and says, 'Who wants to race me at running?'");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Do you want to race Iggy on stage?");
        String userinput2 = input2.nextLine();
2
        if (userinput2 == "yes"){
            System.out.println("You and Iggy start racing. It's neck and neck! You win by a shoelace!");}
        else 
            {System.out.println("Oh no! Iggy shakes his head and sings 'I set a pace, so I can race without pacing.'");}
        Scanner prompt = new Scanner(System.in); 
        System.out.println("Rate your experience on a 1-10");   
		
        int feedback = prompt.nextInt();
		
        if(feedback >= 8){
			System.out.print("Thank you! You should race again at the next concert!");
        } else {
			System.out.print("I'll keep practicing coding and racing.");
		}
	}
}


