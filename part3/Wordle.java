package part3;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    Scanner f = new Scanner(new File("words.txt"));
    String[] words = new String[189];
    public Wordle() throws IOException {
        for (int i = 0; i < words.length; i++) {
            words[i] = f.nextLine();
        }
    }
    public static void main(String[] args) throws IOException {
        Wordle w = new Wordle();
        Random rand = new Random();
        Scanner i = new Scanner(System.in);
        String chosenWord = w.words[rand.nextInt(0, w.words.length)];
        // System.out.println(chosenWord); Uncomment for testing
        String[] GuessedLetters = {"_", "_", "_", "_", "_"};
        System.out.println("Welcome to Wordle!\n\nIn this game you will guess a secret 5 letter word. Each turn you will guess a 5 letter word and I will tell you if a letter is correct and in the correct location with a \"*\", if a letter is correct but in the wrong location with a \"!\", and if a letter is incorrect with a \"?\".\n");
        for (int attempt = 0; attempt < 6; attempt++) {
            System.out.print("\nGuess the secret word: " + String.join(" ", GuessedLetters)+ "\nYour guess: ");
            String guess = i.nextLine();
            if (guess.equals(chosenWord)) {
                System.out.println("Correct! The word was " + chosenWord + "!");
                i.close();
                System.exit(0);
            }
            for (int j = 0; j < 5; j++) {
                if (guess.charAt(j) == chosenWord.charAt(j)) {
                    GuessedLetters[j] = String.valueOf(guess.charAt(j));
                    System.out.print("*");
                } 
                else if (chosenWord.contains(guess.charAt(j) + "")) {
                    System.out.print("!");
                } 
                else {
                    System.out.print("?");
                }
            }
        }
        i.close();
        System.out.println("\nSorry, you exceded 5 guesses! The word was " + chosenWord + ".");
    }
}
