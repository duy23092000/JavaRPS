package test20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var game = new GamePlay();
        char quit = ' ';

        while (quit != 'Q') {
            game.play();
            System.out.println("Play again? Press any key to continue, or 'Q' to quit!");
            quit = input.nextLine().toUpperCase().charAt(0);
        }
        input.close();
        game.displayStats();
    }
}
