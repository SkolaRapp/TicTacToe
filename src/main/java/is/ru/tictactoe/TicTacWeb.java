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
            get("/", (req, res) -> runGame());
        }

        static int getHerokuPort() {
            ProcessBuilder psb = new ProcessBuilder();
            if (psb.environment().get("PORT") != null) {
               return Integer.parseInt(psb.environment().get("PORT"));
           }
           return 4567;
       }

       private static String runGame() {
        TicTacToe game = new TicTacToe();
        char[] inputStrings = new char[9];

        inputStrings = fillTempArray(inputStrings);

        return printHtml(printGameBoard(inputStrings));
        //return printHtml(printGameBoard(game.printBoard(inputStrings)));
    }

    private static String printHtml(String body){
        String html = "<!DOCTYPE html><html><head><title>Tic Tac Wolfes</title></head>"
        +"<body> " + body + "</body>" +
        "</html>";
        return html;
    }
    private static String printGameBoard(char[] gameBoard){

        String table = "<table style=\"width:50%; height:200px; border: 1px solid black;\"><tr>";

        for(int i = 1; i <= 9; i++){
            //table += "<td>" + Character.toString(gameBoard[i]) + "</td>";
            table += "<td>" + i + "</td>";

            if(i % 3 == 0){
                table += "</tr><tr>";
            }
        }
        table += "</table>";
        return table;
    }
    private static char[] fillTempArray(char[] board){
        for(int i = 0; i < 9; i++){
            board[i] = (char)i;
        }
        return board;
    } 
}