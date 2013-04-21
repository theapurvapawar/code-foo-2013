var wordSearchArray = 
[
["x",	"n",	"t",	"g",	"j",	"h",	"e",	"a",	"l",	"t",	"h",	"u",	"s",	"k",	"b",	"w",	"a",	"s",	"t",	"a"],
["s",	"o",	"u",	"j",	"y",	"n",	"z",	"w",	"x",	"b",	"t",	"g",	"m",	"v",	"y",	"b",	"o",	"l",	"a",	"h"],
["h",	"t",	"i",	"l",	"t",	"s",	"l",	"e",	"q",	"d",	"c",	"r",	"a",	"n",	"d",	"r",	"p",	"x",	"z",	"b"],
["p",	"s",	"h",	"e",	"p",	"b",	"n",	"o",	"r",	"e",	"b",	"a",	"z",	"o",	"o",	"k",	"a",	"s",	"b",	"u"],
["l",	"i",	"d",	"n",	"o",	"l",	"y",	"p",	"r",	"v",	"a",	"s",	"j",	"p",	"p",	"j",	"o",	"s",	"r",	"d"],
["i",	"e",	"v",	"y",	"r",	"u",	"m",	"g",	"b",	"e",	"l",	"s",	"g",	"r",	"y",	"l",	"h",	"c",	"x",	"z"],
["a",	"h",	"m",	"h",	"o",	"n",	"k",	"i",	"l",	"l",	"t",	"a",	"c",	"u",	"l",	"a",	"r",	"o",	"b",	"y"],
["b",	"o",	"i",	"e",	"q",	"d",	"o",	"n",	"s",	"y",	"b",	"s",	"o",	"t",	"x",	"o",	"g",	"r",	"a",	"p"],
["h",	"o",	"w",	"i",	"t",	"e",	"u",	"z",	"a",	"t",	"y",	"s",	"e",	"d",	"o",	"b",	"f",	"e",	"v",	"s"],
["a",	"i",	"s",	"c",	"a",	"r",	"k",	"a",	"e",	"i",	"d",	"i",	"s",	"i",	"c",	"h",	"i",	"o",	"p",	"t"],
["o",	"d",	"b",	"a",	"d",	"b",	"o",	"h",	"d",	"r",	"y",	"n",	"y",	"l",	"e",	"v",	"e",	"l",	"a",	"e"],
["l",	"d",	"k",	"u",	"i",	"u",	"j",	"i",	"r",	"e",	"g",	"s",	"d",	"a",	"s",	"q",	"a",	"b",	"g",	"v"],
["d",	"i",	"u",	"c",	"b",	"s",	"t",	"a",	"d",	"l",	"k",	"l",	"h",	"y",	"a",	"s",	"p",	"i",	"l",	"e"],
["v",	"o",	"j",	"c",	"i",	"s",	"h",	"j",	"g",	"o",	"d",	"y",	"o",	"o",	"m",	"g",	"o",	"l",	"d",	"s"],
["w",	"r",	"i",	"l",	"k",	"d",	"b",	"g",	"l",	"a",	"y",	"i",	"r",	"i",	"s",	"t",	"g",	"x",	"g",	"m"],
["l",	"t",	"s",	"c",	"r",	"a",	"g",	"a",	"h",	"d",	"e",	"s",	"d",	"q",	"b",	"a",	"h",	"w",	"d",	"o"],
["h",	"e",	"a",	"l",	"t",	"i",	"r",	"n",	"o",	"f",	"u",	"y",	"e",	"a",	"l",	"w",	"y",	"e",	"h",	"m"],
["f",	"m",	"u",	"s",	"h",	"r",	"o",	"o",	"m",	"e",	"h",	"a",	"p",	"p",	"i",	"n",	"d",	"r",	"t",	"o"],
["l",	"h",	"f",	"h",	"p",	"y",	"o",	"n",	"u",	"k",	"a",	"c",	"o",	"l",	"a",	"o",	"r",	"e",	"b",	"v"],
["p",	"a",	"r",	"e",	"l",	"z",	"d",	"d",	"k",	"a",	"p",	"r",	"o",	"t",	"o",	"m",	"a",	"n",	"p",	"l"],
["m",	"j",	"o",	"p",	"o",	"u",	"y",	"o",	"m",	"l",	"q",	"u",	"a",	"l",	"i",	"n",	"l",	"d",	"w",	"y"],
["w",	"a",	"p",	"a",	"n",	"y",	"r",	"r",	"r",	"j",	"y",	"o",	"a",	"h",	"z",	"n",	"i",	"x",	"e",	"m"],
["m",	"l",	"s",	"r",	"i",	"w",	"h",	"f",	"t",	"i",	"n",	"o",	"g",	"r",	"o",	"l",	"s",	"e",	"y",	"s"],
["l",	"y",	"l",	"d",	"n",	"i",	"k",	"u",	"o",	"y",	"d",	"l",	"u",	"o",	"w",	"u",	"k",	"d",	"e",	"o"],
["o",	"y",	"o",	"q",	"y",	"a",	"k",	"d",	"j",	"e",	"b",	"l",	"u",	"n",	"d",	"e",	"r",	"s",	"c",	"u"],
];


function showArray()
{

var tableString;

tableString = "<table border='0' cellspacing='10'>";
for(var i=0;i<25;i++)
{
	tableString = tableString + "<tr>";

	for(var j=0;j<20;j++)
	{
		tableString = tableString + "<td onclick='changeColor(this);'>" + wordSearchArray[i][j] + "</td>";		
	}

	tableString = tableString + "</tr>";
}
tableString = tableString + "</table>";

document.getElementById("array").innerHTML=tableString;
}

function changeColor(cell)
{
  if ((cell.style.backgroundColor == "none") || (cell.style.backgroundColor == ""))
    {cell.style.backgroundColor = "black";cell.style.color = "white";}
  else
    {cell.style.backgroundColor = "";cell.style.color = "black";}
}

function find()
{

var txt = document.getElementById("inputbox").value;
txt = txt.toLowerCase();
txt = txt.replace(/\s+/g, '');
var disp="";

disp = horizontalSearch(wordSearchArray,txt);
if(disp=="Not Found")
	disp = verticalSearch(wordSearchArray,txt);
if(disp=="Not Found")
	disp = reverseHorizontalSearch(wordSearchArray,txt);
if(disp=="Not Found")
	disp = reverseVerticalSearch(wordSearchArray,txt);
if(disp=="Not Found")
	disp = DiagLTtoRB(wordSearchArray,txt);
if(disp=="Not Found")
	disp = DiagRTtoLB(wordSearchArray,txt);

document.getElementById("demo").innerHTML=disp;
}

function horizontalSearch(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var i=0;i<25;i++)
	{
		for(var j=0;j<20;j++) //linearly searches horizontally
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;
				if(k==InputLength) //reached end of word
					return disp+"Found";				
			}
			else
			{
				k=0; //start again
				disp=""; //clear 
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;
				}
			}								
			
		}
	}

return "Not Found";
}

function verticalSearch(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var j=0;j<20;j++)
	{
		for(var i=0;i<25;i++) //linearly searches vertically
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;
				if(k==InputLength) //reached end of word
					return disp+"Found";
			}
			else
			{
				k=0; //start again
				disp=""; //clear 
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;
				}				
			}								
			
		}

	}

return "Not Found";

}

function reverseHorizontalSearch(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var i=0;i<25;i++)
	{
		for(var j=19;j>-1;j--) //linearly searches horizontally in reverse direction
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;
				if(k==InputLength) //reached end of word
					return disp+"Found";
			}
			else
			{
				k=0; //start again
				disp=""; //clear 
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;
				}
			}								
			
		}
	}

return "Not Found";
}

function reverseVerticalSearch(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var j=0;j<20;j++)
	{
		for(var i=24;i>-1;i--) //linearly searches vertically in reverse direction
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;
				if(k==InputLength) //reached end of word
					return disp+"Found";
			}
			else
			{
				k=0; //start again
				disp=""; //clear
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;
				} 
			}								
			
		}
	}

return "Not Found";
}

function DiagLTtoRB(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var i=0;i<25;i++)
	{
		for(var j=0;j<20;j++) //linearly searches diagonally left-top to right-bottom
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;i++;
				if(k==InputLength) //reached end of word
					return disp+"Found";				
			}
			else
			{
				k=0; //start again
				disp=""; //clear 
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;i++;
				}
			}								
			
		}
	}

return "Not Found";
}

function DiagRTtoLB(SearchArray,Input)
{

var InputLength = Input.length;
var disp="";

var k=0;
var flag=0;

	
	for(var i=0;i<25;i++)
	{
		for(var j=19;j>-1;j--) //linearly searches diagonally right-top to left-bottom
		{
		
			if(Input.charAt(k)==SearchArray[i][j])
			{
				disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
				k++;i++;
				if(k==InputLength) //reached end of word
					return disp+"Found";				
			}
			else
			{
				k=0; //start again
				disp=""; //clear 
				if(Input.charAt(k)==SearchArray[i][j])
				{
					disp=disp+" "+SearchArray[i][j]+"("+(i+1)+","+(j+1)+")-->";
					k++;i++;
				}
			}								
			
		}
	}

return "Not Found";
}



