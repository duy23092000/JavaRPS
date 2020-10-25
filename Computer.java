package test20;

import java.util.Random;

public class Computer extends RockPaperScissor {
    private final Random rand;

    public Computer() {
        super();
        rand = new Random();
    }

    public CHOICES getComputerChoice() {
        int choice = 1 + rand.nextInt(3);
        return switch (choice) {
            case 1 -> CHOICES.ROCK;
            case 2 -> CHOICES.PAPER;
            default -> CHOICES.SCISSOR;

        };
    }
}
