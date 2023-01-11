import java.util.Random;
import java.util.Scanner;

public class PickANumber {
    public static void  main(String[] args)
    {
        //Header for the User
        System.out.println("----------------------------------");
        System.out.println(" Pick a number between 1-100 "   );
        System.out.println("----------------------------------");
        System.out.println();

        Random rand = new Random();
        int random_number = rand.nextInt(99) + 1;

        Scanner myKeyboard= new Scanner(System.in);
        System.out.println("Pick a number between 0 and 100 (you have 5 guesses): ");
        int guess;
        int numberOfTries = 1 ;
        boolean win = false ;
        while (win == false){
            guess = myKeyboard.nextInt();

            if (numberOfTries < 5)
            {
                if (guess == random_number)
                {
                    System.out.println();
                    System.out.println("You guessed it correct ! The Number is : " + random_number);
                    System.out.println("It only took you " + numberOfTries + "guesses to get it right!");
                    myKeyboard.close();
                    win = true;
                }
                else if (guess < random_number)
                {
                    System.out.println("You are too low!");
                    System.out.println();
                    System.out.println("Guess again: ");
                }
                else if (guess > random_number)
                {
                    System.out.println("You are too high!");
                    System.out.println();
                    System.out.println("Guess Again");
                }
            }
            else if (numberOfTries == 5)
            {
                if (guess == random_number)
                {
                    System.out.println();
                    System.out.println("You guessed it correct ! The Number is : " + random_number);
                    System.out.println("It only took you " + numberOfTries + " guesses to get it right!");
                    myKeyboard.close();
                    win = true;
                }
                if (guess != random_number)
                {
                    System.out.println();
                    System.out.println("Sorry you ran out of attempts. The correct number is : " + random_number + " Better luck next time");
                    System.out.println();
                    myKeyboard.close();
                    break;
                }
            }

            numberOfTries = numberOfTries + 1 ;

        }
    }
}