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
        String layout = "templates/layout.vtl";

            port(getHerokuPort());
            //get("/", (req, res) -> runGame());

            get("/", (request, response) -> {
                HashMap model = new HashMap();
                model.put("template", "templates/ourTable.vtl" );
              return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

            get("/gameHasStarted", (request, response) -> {
                HashMap model = new HashMap();
                //Next function gets the string the form sends in
                String numberFromForm = request.queryParams("numberFromForm");
                boolean checkIfMoveIsValid = game.checkIfNoChangeWasMade(numberFromForm);
                String newString = game.returnNewString(numberFromForm);
                boolean isTheGameOver = game.isThereAWinner(newString);
                String computerMove = game.returnTheStringAfterComputerMove(numberFromForm, newString, checkIfMoveIsValid, isTheGameOver);
                isTheGameOver = game.isThereAWinner(computerMove);
                char resultOfTheGame = game.getResult(isTheGameOver, computerMove);
                //Throw the updated String into the html file
                model.put("newString", newString);
                model.put("computerMove", computerMove);
                model.put("resultOfTheGame", resultOfTheGame);
                model.put("template", "templates/gameHasStarted.vtl");

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