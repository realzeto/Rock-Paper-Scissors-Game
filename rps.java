package progs;

import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] plays = { "rock", "paper", "scissors" };
        String botPlay = plays[new Random().nextInt(plays.length)];

        System.out.print("--------------------------------------------\n");
        System.out.print("Welcome to my Rock Paper Scissors game!");
        System.out.print("\n--------------------------------------------");
        System.out.print("\nPlay your move! Options are Rock Paper & Scissors!: ");
        String userPlay = scanner.next();

        if (userPlay.equals(botPlay)) {
            System.out.println("Tie!");
        } else if (userPlay.equals("scissors") && botPlay.equals("paper")) {
            System.out.println("You win! " + userPlay + " beats " + botPlay);
        } else if (userPlay.equals("paper") && botPlay.equals("rock")) {
            System.out.println("You win! " + userPlay + " beats " + botPlay);
        } else if (userPlay.equals("rock") && botPlay.equals("scissors")) {
            System.out.println("You win! " + userPlay + " beats " + botPlay);
        } else if (userPlay.equals("paper") && botPlay.equals("scissors")) {
            System.out.println("You lose! " + botPlay + " beats " + userPlay);
        } else if (userPlay.equals("rock") && botPlay.equals("paper")) {
            System.out.println("You lose! " + botPlay + " beats " + userPlay);
        } else if (userPlay.equals("scissors") && botPlay.equals("rock")) {
            System.out.println("You lose! " + botPlay + " beats " + userPlay);
        }
        scanner.close();
    }
}
