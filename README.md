#learnGIT

###Introduction
This **README** includes _a readme_ with:
> *Markdown Basics* :panda_face: 
######BUT
The main point of this repo is to create a terribly messy git log from practising git commands. 
Below is a listing of some useful commands:


###Git Commands: 

ADD (aka staging)          |  What does it do?
------------               | ---------------
git add .                  |  adds(aka stages) all -> after version 2.X
git add -u                 |  adds modified / deleted (not untracked) 
git add --ignore-removal . |  adds modified / new (not deleted)

REMOVE                     |  What does it do?
------------               | ---------------
git rm <file>              | removes the file  
git rm --cached            | keep file but undo your commit 
git rm \*~  	           | removes everything ending with '~' 


COMMIT  		   | What does it do?
-------------              | ----------------
git commit -v              | Opens default editor (vim) and shows diff
git commit -a -m "msg"     | Adds & commits  all tracked files with commit message: "msg"
git commit -amend          | Opens editor to change commit message

DIFF			   | What does it do?
-------------              | ----------------
git diff 		   | Shows changes made in your current working directory
git diff --cached     	   | Shows difference between
git diff --staged	   | Shows difference between 


###Code Formatting 
This is done using one or three backticks "`"
```
int x;
x = 2 + 2;
destroy(x);
```
The above function `destroy(x)` does nothing. 




######Links
[Reference!](http://git-scm.com/doc)
http://git-scm.com/doc
https://github.com/github/gitignore
