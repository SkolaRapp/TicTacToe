# TicTacToe
This TicTacToe project is an assigment for T-303-HUGB class in Reykjavik University Autumn 2017.

## Design Report

### Low fidality design
Initially we decided to go with a web based TicTacToe where you would click on the space you wanted to mark with your X. The opponents O would be filled automatically at random. To begin a new game you press the reset button and a new game starts.

![alt text](https://github.com/SkolaRapp/TicTacToe/blob/develop/docs/images/lowfid.jpg "Low Fidality")


### Class Diagram
The initial design included dividing the code of the project into three different layers, UI layer, logic layer and data layer. With each layer having a different functionality. The UI layer contains all the code that represents what the user can see and the code should be stored in a class called TicTacWeb. The logic layer contains the code of the actual logic of the game and should be stored in a class called TicTacToe. The Data layer should take care of the storting a pulling information from the database and everything that is associated with it, for example the high score. Furthermore, there is an Entity class which contains the information about the player. The class diagram here below explains the initial design of the project. 

![alt text][classDiagram]

[classDiagram]: https://github.com/SkolaRapp/TicTacToe/blob/develop/docs/images/classDiagram.jpg "Class Diagram"


### Git, Travis and Heroku flowchart
There are two main branches, master and develop. When a new feature is 
made, a new feature branch is made from the develop branch. When a feature
is completed the feature branch it goes through selenium and unity testing before it is merged into the develop branch.  When it has merged successfully then the feature branch should be deleted. Before the develop branch can be merged automatically into the master branch it has go through Travis for testing, to Heroku testing server, and if it builds without errors it will let Travis know it has which will allow the merge to Master branch happen. From the Master branch it will be deployd to the Heroku master server after a Travis Test.

<img src="https://github.com/SkolaRapp/TicTacToe/blob/develop/docs/images/git.jpg" alt="classDiagram" width="600" />


[Click here to download](https://gitprint.com/SkolaRapp/TicTacToe/blob/designreport/docs/designReport.md?download)