import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        int maxattempts=7;
        int score=0;
        boolean playagain=true;
         System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100. You have " + maxattempts + " attempts.");

        while(playagain){
            int targetnum=rand.nextInt(100)+1;
            int attempts=0;
            boolean correct=false;
            while(attempts<maxattempts){
                int guess=sc.nextInt();
                attempts++;
                if(guess==targetnum){
                    System.out.println("you have guess the correct number");
                    score++;
                    correct=true;
                    break;
                }
                else if(guess<targetnum){
                    System.out.println("too low");
                }
                else{
                    System.out.println("too high");
                }
            }
            if(!correct){
                System.out.println("you have used all your attempts and the correct number was: " + targetnum);
            }
            System.out.println("your current score is: " + score);
            System.out.println("Do you want to play again(yes/no): ");
            sc.nextLine();
            String response=sc.nextLine();
            System.out.println("again guess the number");

            if(!response.equalsIgnoreCase("yes")){
                playagain=false;
                System.out.println("Thanks for playing. Your final score:" + score);
            }

        }
    sc.close();

    }

}
