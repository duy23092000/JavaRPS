package test20;

import java.util.Scanner;

public class Player extends RockPaperScissor {
    Scanner scan = new Scanner(System.in);

    public Player() {
        super();
    }

    public CHOICES getPlayerChoice() {
        System.out.println("PLease enter your choice: R-ROCK, P-PAPER, S-SCISSOR");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);
        switch (playerChoice) {
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSOR;
        }
        System.out.println("Invalid");
        return getPlayerChoice();
    }
}
