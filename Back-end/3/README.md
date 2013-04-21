Moves Calculator!
=============

Running the program
------------

Requires JRE 1.6 minimun

No need to compile.

The program requires 'JaggerMoves.jar' and 'three-letter-words.txt' to be in the same directory.

To run the program, execute-
```
java -jar JaggerMoves.jar str1 str2
```
where 'str1' and 'str2' are strings from the 'three-letter-words.txt' file.

Example -
```
java -jar JaggerMoves.jar aah sax
```

Implementation
-------------

Implemented in Java

There are three classes -
>1. AdjacencyBuilder class - this basically intakes the 'three-letter-words.txt' file, builds an array of the words and spits out Adjacency matrix --> Cost matrix, calculating the individual moves
>2. Dijkstra class - no explanation required, implementation of the shortest path algorithm, requires the Cost matrix and the input
>3. MainMoves class - simply runs the main class and displays the output on console

notes to myself -
-------------

>wanted to implement in php, but java has an advantage over here.

>1012 words - long list!

>not in a mood to make it static, time to use dynamic arrays! \m/

>advantage? array size increases or decreases on word list size

>damn, this is tiring

>cost matrix program taking time

>argh, not gonna try to expand to more than 3 letter words

>poof, done

>dijkstra time..

>implement dijkstra, input cost matrix, should be done

>why?? moves path not working!!

>one small variable, one big frustration

>done! woohoo!

>longest path found yet -

>Moves from PAY to URN = 5

>Path = URN<-ERN<-ERR<-EAR<-PAR<-PAY

>:) ;)
