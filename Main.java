import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    // create list of answers from a hashmap for each roll (1 - 20)
    HashMap<Integer, String> answers = new HashMap<Integer, String>();    
    answers.put(1, "It is certain.");
    answers.put(2, "It is decidedly so.");
    answers.put(3, "Without a doubt.");
    answers.put(4, "Yes definitely.");
    answers.put(5, "You may rely on it.");
    answers.put(6, "As I see it, yes.");
    answers.put(7, "Most likely.");
    answers.put(8, "Outlook good.");
    answers.put(9, "Yes.");
    answers.put(10, "Signs point to yes.");
    answers.put(11, "Reply hazy, try again.");
    answers.put(12, "Ask again later.");
    answers.put(13, "Better not tell you now.");
    answers.put(14, "Cannot predict now.");
    answers.put(15, "Concentrate and ask again.");
    answers.put(16, "Don't count on it.");
    answers.put(17, "My reply is no.");
    answers.put(18, "My sources say no.");
    answers.put(19, "Outlook not so good.");
    answers.put(20, "Very doubtful.");

    // Explain the 8 ball to the player
    System.out.print("I am a magic 8 ball \nAsk me a question to learn your fortune!\n");

    // Ask player for their question
    Scanner myObj = new Scanner(System.in);
    System.out.println("what would you like to know?");
    String question = myObj.nextLine();
    System.out.println("\nYour question is: " + question);
    myObj.close();

    // Generate a random number between 1 and 20
    Random randomGenerator = new Random();
    int diceRoll = randomGenerator.nextInt(20)+1;
    
    // Print out the players fortune
    System.out.print("\nThe Answer is: " + answers.get(diceRoll));
        
  }
}
