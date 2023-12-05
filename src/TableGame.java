enum State {IN_Progress, FINISHED};
public class TableGame {
    private String name;
    private static int maxPlayers = 8;
    private int currentPlayers;
    private State gameState;
    public TableGame() {

    }

    public TableGame(String name, int currentPlayers, State gameState) {
        this.name = name;
        if(this.currentPlayers >= maxPlayers) {
            System.out.println("Only 8 players are allowed per game, we set the value to 8 and kicked a player of the party");
            this.currentPlayers = 8;
        } else {
            this.currentPlayers = currentPlayers;
        }
        this.gameState = gameState;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public State getGameState() {
        return gameState;
    }

    public void setGameState(State gameState) {
        this.gameState = gameState;
    }
    public int getCurrentPlayers() {
        return currentPlayers;
    }

    public void setCurrentPlayers(int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }
    public void startGame() {
        this.setGameState(State.IN_Progress);
    }
    public void finishGame() {
        this.setGameState(State.FINISHED);
    }
    public void addPlayer() {
        if(this.currentPlayers >= TableGame.maxPlayers) {
            System.out.println("You can't add more Players, only 8 players are allowed");
        } else {
            currentPlayers++;
        }
    }
    public void makeAPlay() {
        System.out.println("Welcome to the Epic Adventure Game! Come back another time");
        System.out.println("  _______ _                 _     _     _______             ");
        System.out.println(" |__   __| |               | |   | |   |__   __|            ");
        System.out.println("    | |  | |__   __ _ _ __ | |__ | |_ _   | | ___   __ _    ");
        System.out.println("    | |  | '_ \\ / _` | '_ \\| '_ \\| __| |  | |/ _ \\ / _` |   ");
        System.out.println("    | |  | | | | (_| | | | | | | | |_ _|  | | (_) | (_| |   ");
        System.out.println("    |_|  |_| |_|\\__,_|_| |_|_| |_|\\__(_)  |_|\\___/ \\__, |   ");
        System.out.println("                                                    __/ |   ");
        System.out.println("                                                   |___/    ");
        System.out.println("be ready for an exciting journey in the world of adventures again!");
    }
}
