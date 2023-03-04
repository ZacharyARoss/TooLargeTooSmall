import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int correctNumber = 7;
        int g = 5; //g = amount of user guesses
        int prevG = -1; // previous guesses
        int counter = 0;


        int userAnswer;
        do {
            System.out.println("I am thinking of a number between 1 and 10. Would you like to try and guess it?");

            userAnswer = scan.nextInt();
            counter++;

            if (userAnswer == prevG) {
                counter--;
                System.out.println("You already guessed that, try again.");
            }else  if (userAnswer == correctNumber) {
                System.out.println("That's Correct!");
                System.out.println("You're total guesses are " + counter);
                break;
            } else if (userAnswer < correctNumber) {
                System.out.println("That's Too Small.");
                prevG = userAnswer;
            } else if (userAnswer > correctNumber) {
                System.out.println("That's Too Large");
                prevG = userAnswer;

                }else  if(userAnswer == correctNumber) {
                        System.out.println("That's Correct!");
                        System.out.println("You're total guesses are " + counter);
                        break;


            }

        } while (userAnswer != correctNumber);
    }

        //Sudo

        /* Define a


         */

        }






//Write a guessing game which prompts a user to guess a mystery number within some range.
//After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//Upon termination, the program should display the number of guesses before successfully guessing correctly.
//A number that is input consecutively, should register as a single guess.