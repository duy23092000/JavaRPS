package test20;

public class GamePlay extends RockPaperScissor { //kế thừa từ class RockPaperScissor
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int ties;

    public GamePlay() { // khởi tạo Constructor
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play() { //setter cho player và computer choice
        this.playerChoice = player.getPlayerChoice();
        this.computerChoice = computer.getComputerChoice();
        result = getResult();
        displayResult();
        stats();
    }

    public void displayStats() {
        System.out.println("You have played " + (wins + loses + ties));
        System.out.println("You have won " + wins + " times");
        System.out.println("You have lost " + loses + " times");
        System.out.println("There were " + ties + " ties");
    }

    private void stats() {
        if (result == RESULT.WIN) {
            wins++;
        }
        else if (result == RESULT.LOSE) {
            loses++;
        }
        else {
            ties++;
        }
    }

    private void displayResult() {
        switch (result) {
            case WIN -> System.out.println(playerChoice + " beat " +
                    computerChoice + " . Player WINS");
            case LOSE -> System.out.println(playerChoice + " is defeated by " +
                    computerChoice + " . Player LOSES");
            case TIE -> System.out.println(playerChoice + " is the same with " +
                    computerChoice + " . Relax. It's a TIE");
        }
    }

    private RESULT getResult() {
        if (playerChoice == computerChoice) {
            return RESULT.TIE;
        }
        switch (playerChoice) {
            case ROCK:
                if (computerChoice == CHOICES.SCISSOR) {
                    return RESULT.WIN;
                }
                else {
                    return RESULT.LOSE;
                }
            case PAPER:
                if(computerChoice == CHOICES.ROCK) {
                    return RESULT.WIN;
                }
                else {
                    return RESULT.LOSE;
                }
            case SCISSOR:
                if (computerChoice == CHOICES.PAPER) {
                    return RESULT.WIN;
                }
                else {
                    return RESULT.LOSE;
                }
        }
        return RESULT.LOSE;
    }

}
