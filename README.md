# 

### Introduction
This **README** includes _a readme_ with:
> *Markdown Basics* :panda_face:  

###### BUT
The main point of this repo is to create a terribly messy git log from practicing git commands. 
Below is a listing of some useful commands:


### Git Commands: 
 COMMAND                    | WHAT DOES IT DO?
|:-----------:              | :---------------:							                        |
| **ADD (aka staging)**     |  
|git add .                  |  adds(aka stages) all -> after version 2.X			   |	
|git add -u                 |  adds modified / deleted (not untracked) 				   |
|git add --ignore-removal . |  adds modified / new (not deleted)	 			         |
|-----------                |-----------  
| **REMOVE**                | 
|git rm <file>              | removes the file  					                         |
|git rm --cached            | keep file but undo your commit 					            |
|git rm \*~  	              | removes everything ending with '~' 				         |
|-----------                |-----------  
| **COMMIT**   		           |
|git commit -v              | Opens default editor (vim) and shows diff			  	                 |
|git commit -a -m "msg"     | Adds & commits  all tracked files with commit message: "msg"	   |
|git commit -amend          | Opens editor to change commit message				                       | 			    
|-----------                |-----------  
| **DIFF**                  |			
|git diff 	            	    | Shows changes made in your current working directory	                   |
|git diff --cached     	    | Shows difference between most recent commit and an added(staged) file   |
|git diff HEAD              | Shows what changed since last commit			                                 |
|git diff HEAD^             | Shows what changed since the commit BEFORE the latest commit            |
| **RESET**                 |
|git reset HEAD <file>      | Uncommit a file							    |
|git reset --soft HEAD^     | Undo last commit							   |                            
|-----------                |-----------  
| **REVERT**                |
|git revert <commit id>     | Undo a previous commit           |
|-----------                |-----------  
| **LOG**                   |
|git log -p                 | Shows diff in the log						      |
|git log --pretty=oneline   | Shows oneline in a pretty way		  |
|git log --oneline --graph  | Shows an ACSII graph 						      |
|git log -Sfoobar           | Shows commits matching "foobar"  |
| **BRANCH**                |
|git branch <name>          | Create a branch 							                  |
|git branch -d <name>       | Delete a branch							                   |
|git checkout -b <name>     | Create a new branch and switch to it				 |
|git merge <name>>          | Merge your branch with the master branch	|


### Code Formatting 
This is done using one or three backticks "`"
```
int x;
x = 2 + 2;
destroy(x);
```
The above function `destroy(x)` does nothing. 

![alt text](Assets/image.png)


###### Links
[Reference!](http://git-scm.com/doc)
http://git-scm.com/doc
https://github.com/github/gitignore
