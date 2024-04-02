public class GuessGame {

    // Init Players
    Player player1;
    Player player2;
    Player player3;

    // Target Number;
    int targetNumber;
    int round = 1;

    // winners
    boolean p1Win = false;
    boolean p2Win = false;
    boolean p3Win = false;

    public void initPlayers () {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
    }

    public void playerGuess() {
        player1.guess();
        player2.guess();
        player3.guess();
    }

    public void displayPlayerGuessNumbers() {
        System.out.println("Player 1 Guess number : " + player1.number);
        System.out.println("Player 2 Guess number : " + player2.number);
        System.out.println("Player 3 Guess number : " + player3.number);
    }

    public int getTargetNumber() {
        return (int) (Math.random() * 10);
    }

    public void displayTargetNumber() {
        System.out.println("The Target number is " + targetNumber);
    }

    public void checkResult() {
        if (targetNumber == player1.number) {
            p1Win = true;
            System.out.println("Player 1 win this game");
        }
        if (targetNumber == player2.number) {
            p2Win = true;
            System.out.println("Player 2 win this game");
        }
        if (targetNumber == player3.number) {
            p2Win = true;
            System.out.println("Player 3 win this game");
        }
    }

    public void startGame() {
        System.out.println("==============================");
        System.out.println("|*|*|*| GAME START NOW |*|*|*|");
        System.out.println("==============================");
        System.out.println("");

        // Init Players
        initPlayers();

        while (true) {
            System.out.println("Round " + round);

            // Start Guesting Number
            playerGuess();

            // Player Guessed Number
            displayPlayerGuessNumbers();

            // Target Number
            targetNumber = getTargetNumber();
            displayTargetNumber();

            // Check Result
            checkResult();

            if (p1Win || p2Win || p3Win) {
                System.out.println("");
                System.out.println("*** We're now got our Winners!!! ***");
                System.out.println("=========================");
                System.out.println("|*|*|*| GAME OVER |*|*|*|");
                System.out.println("=========================");
                break;
            }

            System.out.println("Try again next round");
            System.out.println("========== XXXXX ==========");
            System.out.println("");
            ++round;
        }
    }

}