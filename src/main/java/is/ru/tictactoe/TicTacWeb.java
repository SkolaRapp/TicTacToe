package is.ru.tictactoe;


import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;


public class TicTacWeb {
    public static void main(String[] args) {
        staticFileLocation("/public");

            port(getHerokuPort());
            get("/", (req, res) -> runGame());

            get("/test", (request, response) -> {
              return new ModelAndView(new HashMap(), "templates/hello.vtl");
            }, new VelocityTemplateEngine());
        }

        static int getHerokuPort() {
            ProcessBuilder psb = new ProcessBuilder();
            if (psb.environment().get("PORT") != null) {
                return Integer.parseInt(psb.environment().get("PORT"));
         }
         return 4567;
     }

     //this is where the shit happens
     private static String runGame() {
        TicTacToe game = new TicTacToe();
        char[] inputStrings = new char[9];

        //calls getBoard to access the char array for the board
        inputStrings = game.getBoard();
        //inputStrings = fillTempArray(inputStrings);

        return printHtml(printGameBoard(inputStrings));
        //return printHtml(printGameBoard(game.printBoard(inputStrings)));
    }

    private static String printHtml(String body){
        String html = "<!DOCTYPE html><html><head><title>Tic Tac Wolfes</title></head>"
        +"<body> " +
        "<h2>Welcome to our simple TicTacToe game</h2>" +
        body + 
        printForm() + 
        "</body>" +
        "</html>";
        return html;
    }

    private static String printForm(){
        String userForm = "<form action=\"/game/\">"+
        "Enter number for next value: <input type=\"number\" name=\"uservalue\" min=\"1\" max=\"9\"><br>" +
        "<input type=\"submit\" value=\"Submit\">" +
        "</form>";
        return userForm;
    }

    private static String printGameBoard(char[] gameBoard){
        String tableCSS = "width:50%; height:200px; border: 1px solid black;text-align: center;";
        String table = "<table style=\" "+ tableCSS +" \"><tr>";

        for(int i = 1; i <= 9; i++){
            table += "<td>" + Character.toString(gameBoard[i-1]) + "</td>";

            if(i % 3 == 0){
                table += "</tr><tr>";
            }
        }
        table += "</table>";
        return table;
    }

    //redundant??
    private static char[] fillTempArray(char[] board){
        /*for(int i = 1; i <= 9; i++){
            board[i-1] = (char)(i + '0');
        }*/
        char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return testBoard;
    } 

    private static String temporaryFunction(){
        String str = "<!DOCTYPE html>" +
         "<html>" +
         "<head>" +
           "<title>Hello Friend!</title>" +
           "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
         "</head>" +
        "<body>" +
           "<h1>Hello From Afar</h1>" +
           "<p>Dear Friend,</p>" +
           "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
           "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
           "<p>But I like programming a lot, so I've got that going for me. </p>" +
           "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
           "<p>Cheers,</p>" +
           "<p>Travel Enthusiast Jane</p>" +
         "</body>" +
       "</html>";

       return str;
    }
}