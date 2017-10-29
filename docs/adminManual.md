# TicTacToe
This TicTacToe project is an assigment for T-303-HUGB class in Reykjavik University Autumn 2017.

## Administration manual 
How to set it up and get it to run, also on a
fresh machine. How to install and run the program on clients machine
(in case of simple desktop program). How to deploy, run and maintain
in case of client/server or web application.

What an admin needs to set up the project.

Admin needs to:

### Set up gradle

	https://gradle.org/install/

* To build and test the project:

		gradle build

* To run the project:

		gradle stage

* The port to run the game is currently:

		4567

### Set up Travis

1. 	Fork the TicTacToe repository: https://github.com/SkolaRapp/TicTacToe
	Note: since this is a public repo, you can't fork is as a private repo
	(directly at least).

2.	Go to Travis-ci.org

	a.	Sign in with GitHub
	
	b.	Give GitHub access to this repository (note you might need to "sync" repos to 		Travis CI, using a button).

3.	Clone the repo to your local environment

### Set up Heroku

1.	Sign up for free on Heroku.com.

2.	Setup the Heroku Toolbelt https://devcenter.heroku.com/articles/heroku-cli

3.	Sign in using the Heroku Toolbelt

4.	In the root of the repo create a new Heroku app: heroku apps:create

5.	Take a look at https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#introduction

6.	Add a stage task to your build.gradle file, and add a Procfile, similar to the one given in the Getting started guide.

7.	Commit and push to Heroku: git	commit	-m	"Added	Heroku	Procfile"; git push heroku	master

8.	You should now have a running application somewhere on herokuapp.

#### Heroku staging and deployment server

* Staging
	
	https://skolarapp-stage.herokuapp.com/

* Deployment

	https://skolarapp-depl.herokuapp.com/
* Code Coverage
	url/cc
	
[Click here to download](https://gitprint.com/SkolaRapp/TicTacToe/blob/develop/docs/adminManual.md?download)
