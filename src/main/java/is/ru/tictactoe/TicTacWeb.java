package is.ru.tictactoe;

import java.util.HashMap;
import java.lang.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;


public class TicTacWeb {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        staticFileLocation("/public");
        staticFiles.location("/public");

        String layout = "templates/layout.vtl";

            port(getHerokuPort());

            //Setup the starting site when you run the program the first time
            get("/", (request, response) -> {
                HashMap model = new HashMap();
                model.put("template", "templates/ourTable.vtl" );
              return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());
            
            get("/cc", (request, response) -> {
                response.redirect("jacocoHtml/index.html"); return null;

            });

            //This is the code to run the .vtl file after the game has started
            get("/gameHasStarted", (request, response) -> {
                HashMap model = new HashMap();
                //Next function gets the string the form sends in
                String numberFromForm = request.queryParams("numberFromForm");
                //Need to check if the form has X or O or a digit in it
                boolean checkIfMoveIsValid = game.checkIfNoChangeWasMade(numberFromForm);
                //Update the boardString based on the number we sent in through the form
                String newString = game.returnNewString(numberFromForm);
                //Check if the game is over
                boolean isTheGameOver = game.isThereAWinner(newString);
                //Let the computer make his move
                String computerMove = game.returnTheStringAfterComputerMove(numberFromForm, newString, checkIfMoveIsValid, isTheGameOver);
                //Check again if there is a winner 
                isTheGameOver = game.isThereAWinner(computerMove);
                //Get the result of the game
                char resultOfTheGame = game.getResult(isTheGameOver, computerMove);
                //Throw the updated string, computermove and the result of the game into the 
                //.vtl file
                model.put("newString", newString);
                model.put("computerMove", computerMove);
                model.put("resultOfTheGame", resultOfTheGame);
                model.put("template", "templates/gameHasStarted.vtl");
                //Return the .vtl file with the VelocityTemplateEngine
              return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());
 
            //On restart we return the .vtl file with the new board
            get("/newGame", (request, response) -> {
                HashMap model = new HashMap();
                //Restart the game with the next function
                game.newGame();
                //Get the new board
                char[] temp = game.getBoard();
                //Convert the new board to a string to send to the .vtl file
                String newString = game.makeStringFromCharArray(temp);
                //Send the board as a string to the .vtl file
                model.put("newString", newString);
                model.put("template", "templates/newGame.vtl" );
              return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
     return 4567;
    }
}