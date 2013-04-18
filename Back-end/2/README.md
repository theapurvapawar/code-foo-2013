High Score Sorting
=============

Implemented in Java

There are four basic classes -
1. player class - this holds the individual player's name(string) and score(float).
2. ScoreParser class - this basically is a SAX parser implementation, where it parses the input file and creates an array of objects of the player class
3. QuickSortScore class - this sorts the array of objects according to the player score in ascending order.
4. HighScoreSort class - simply runs the main class and displays the sorted array of objects in descending order on the console.

Running the program
------------

Requires JRE 1.6 minimun

No need to compile.

The program takes in 'score.xml' (or any other xml file with the same nodes) as the input file where Players' names and scores are defined.

To run the program, use the 'HighScoreSort-jar.jar' and execute the command:
```
java -jar HighScoreSort-jar.jar /path/to/score.xml
```

Choosing QuickSort
-------------

Although QuickSort's worst case time complexity is O(n^2), QuickSort still is much more preferred than MergeSort. The reason being, that the memory requirement for QuickSort is much less than that of MergeSort, which also helps it to scale well. To help reduce it's time complexity from O(n^2) to O(nlogn), an implementation of 'IntroSort' is used with QuickSort in modern applications, which basically makes the QuickSort shift to HeapSort when the recursive depth exceeds a certain limit.

Why XML as input?
-------------

Always easier and faster to parse a structured document. Helps a lot in scalability. Especially when used with a SAX parser. DOM parser uses a lot of memory.




