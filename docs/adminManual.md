# TicTacToe
This TicTacToe project is an assigment for T-303-HUGB class in Reykjavik University Autumn 2017.

## Administration manual 
How to set it up and get it to run, also on a
fresh machine. How to install and run the program on clients machine
(in case of simple desktop program). How to deploy, run and maintain
in case of client/server or web application.

What an admin needs to set up the project.

Admin needs to:

### Set up Travis

1. 	Fork the TicTacToe repository: https://github.com/SkolaRapp/TicTacToe
	Note: since this is a public repo, you can't fork is as a private repo
	(directly at least).

2.	Go to Travis-ci.org

	a.	Sign in with GitHub
	
	b.	Give GitHub access to this repository (note you might need to "sync" repos to Travis CI, using a button).

3.	Clone the repo to your local environment

### Set up Heroku

1.	Sign up for free on Heroku.com.

2.	Setup the Heroku Toolbelt https://devcenter.heroku.com/articles/heroku-cli

3.	Sign in using the Heroku Toolbelt
i
4.	Using the same repo as in the first part of the assignment; in the root create a new Heroku app: heroku	apps:create

5.	Take a look at https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#introduction

6.	Add a stage task to your build.gradle file, and add a Procfile, similar to the one given in the Getting started guide.

7.	Commit and push to Heroku: git	commit	-m	"Added	Heroku	Procfile"; git push heroku	master

8.	You should now have a running application somewhere on herokuapp.

### Putting Travis CI & Heroku together

Disclaimer: This is where things get tricker, and we'll only help move you in the right direction.

To move from a simple Continuous integration cycle, to something more complicated continuous delivery, you will need to define a staging server. This can easily be a Heroku app server. How would you go about setting the following up:

1.	Code changes are made to a feature branch as a part of a pull request

2.	Travis runs all unit and integration tests on commit and push to GitHub

	a.	If there are failures, GitHub would show this on the pull request.
	
	b.	If the tests pass and other checks pass.

		1.	Travis CI will deploy the application to a staging server.
		2.	That can be used for manual testing, or later some functional tests like Selenium tests.

[Click here to download](https://gitprint.com/SkolaRapp/TicTacToe/blob/develop/docs/adminManual.md?download)
