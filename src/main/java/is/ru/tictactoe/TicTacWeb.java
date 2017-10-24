package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacWeb {
    public static void main(String[] args) {
        /*
        port(getHerokuPort());
        get("/", (req, res) -> {
            return "No route specified. Try /add/1,2";
        });
        get(
            "/add/:input",
            (req, res) -> add(req.params(":input"))
        );*/
        port(getHerokuPort());
        get("/", (req, res) -> {
            return "No route specified. Try /game/";
        });
        get(
            "/game/",
            (req, res) -> game()
        );
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
	if (psb.environment().get("PORT") != null) {
	    return Integer.parseInt(psb.environment().get("PORT"));
	}
	return 4567;
    }

    private static String game() {
        TicTacToe game = new TicTacToe();
        char[] inputStrings = new char[9];


        for(int i = 0; i < 9; i++){
            inputStrings[i] = '&';
        }


        return game.printBoard(inputStrings);
    }
}