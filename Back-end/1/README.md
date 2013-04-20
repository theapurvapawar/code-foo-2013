Family Tree Search
=============

Running the program
------------

Requires JRE 1.6 minimun

No need to compile.

'family.xml' is the input where the information of every person in family is mentioned.

The program requires 'FamilyTree.jar' and 'family.xml' to be in the same directory.

To run the program, execute-
```
java -jar FamilyTree.jar nameString
```
where 'nameString' is a name from 'family.xml' file.
NOTE : 'nameString' is case-sensitive. (Ex. : type 'Ron' and not 'RON'/'ron'/'rON' etc.)

Scalability of Algorithm
---------------

Any algorithm will scale well if the family tree contains only the "current living" generation. If the tree must include the full family history, the recursive nature of the generation determination might not scale well. This will matter maybe above 100s of generations, but in reality, we may not know of such families.
Also you might note that, I have implemented the DOM parser and not SAX parser. This was just for experimentation. In real case scenarios, SAX parser must be preferred because the input XML document can be huge and DOM parser will load the full document into memory which will affect the peformance.

Implementation
-------------

Implemented in Java

There are three classes -
>1. FamilyTreeParser class - this is a DOM parser implementation, parses and builds an array of objects of class 'Person'
>2. Person class - holds information like name, gender, spouse etc, and implements basic getters and setters
>3. MemberFinder class - takes in the array of objects as input, has methods to search a person and get the generation line, also runs the main class

Last Words
---------
The question is tricky to answer as no input or input format is mentioned. I chose XML as input as its a structured format and its always easy to parse a structured document. XML documents can also be portable.
Also, to understand the family tree I worked with, I drew a family tree in PhotoShop for visualization. The image is 'familytree.png'.


notes to myself-
---------

>no input or input format mentioned
>
>no ways mentioned to build the family tree>
>
>i guess above two points give me the freedom to build the tree my way with my own input format
>
>xml structure it is
>
>defining an xml family tree structure
>
>xml structure will contain node as 'person'
>
>node 'person' will be linked accordingly
>
>elements of 'person'
>	name
>	gender
>	parents
>		father
>		mother
>	spouse	
>
>implementing dom parser just for experimentation
>
>family trees in real life are actually really complicated as there are typically two sides - paternal and maternal
>following up both generations can be tricky, so there has to be a certain set of rules which must be defined.
>
>following the patriarchical tree, the conditions would be -
>1. person's father or spouse must be part of family for the person to be part of family
>2. if fathers generation is 'x', persons generation is 'x+1'
>3. if spouses generation is 'x', persons generation is 'x'
>4. the root level person ( generation no. 1 male) will not have a father ( or wont know the parents? )
>
>for a matriarchical tree, replace father by mother
