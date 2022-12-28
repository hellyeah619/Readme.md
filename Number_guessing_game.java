package tasks;
import java.util.Objects;
import java.util.Scanner;

public class Number_guessing_game {

    public static void Game(){
        Scanner sc = new Scanner(System.in);
        int num;

        {
            num = 1 + (int) (100 * Math.random());
        }
        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("You've to guess the number within 4 trials.");
        int guess;
        for(int i=1;i<5;i++) {
            System.out.println("Enter your guess :");
            guess=sc.nextInt();
            if(guess<num){
                System.out.println("Guess is low...");
                System.out.println("No. of attempts left = "+(4-i));

            } else if (guess>num) {
                System.out.println("Guess is high...");
                System.out.println("No. of attempts left ="+ (4-i));

            }
            else{
                System.out.println("Congratulations You Guessed the Correct Number");
            }
        }
        System.out.println("You are out of moves");
        System.out.println("The number was : "+num);
    }

    public static void main(String[] args) {
        Game();
        System.out.println("Do you want to play again ?"+ "\n Type 'y' for Yes and 'n' for No");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        if(Objects.equals(s, "y")){
            Game();
        }
        else{
            System.out.println("Thank You For Playing..."+"\n Have a Nice Day :)");
        }
    }
}