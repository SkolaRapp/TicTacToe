# TicTacToe
This TicTacToe project is an assigment for T-303-HUGB class in Reykjavik University Autumn 2017.

## Class Diagram
The initial design included dividing the code of the project into three different layers, UI layer, logic layer and data layer. With each layer having a different functionality. The UI layer contains all the code that represents what the user can see and should the code be stored in a class called TicTacWeb. The logic layer contains the code of the actual logic of the game and should that be stored in a class called TicTacToe. The Data layer should take care of the storting a pulling information from the database and everything that is associated with it, for example high score. Furthermore, there is an Entity class which contains the information about the player. The class diagram here below explains the initial design of the project. 

<img src="https://github.com/SkolaRapp/TicTacToe/blob/design/docs/images/classDiagram.jpg" alt="classDiagram" width="600" />

## Git, Travis and Heroku flowchart
There are two main branches, master and develop. When a new feature is 
made, a new feature branch is made from the develop branch. When a feature
is completed the feature branch it goes through selenium and unity testing before it is merged into the develop branch.  When it has merged successfully then the feature branch should be deleted. Before the develop branch can be merged automatically into the master branch it has go through Travis for testing, to Heroku testing server, and if it builds without errors it will let Travis know it has which will allow the merge to Master branch happen. From the Master branch it will be deployd to the Heroku master server after a Travis Test.

<img src="https://github.com/SkolaRapp/TicTacToe/blob/design/docs/images/git.jpg" alt="classDiagram" width="600" />


[Click here to save/print file](https://gitprint.com/SkolaRapp/TicTacToe/blob/design/docs/designReport.md)