import java.io.IOException;
import java.util.ArrayList;


public class Dijkstra {
	
	void shortestPath(ArrayList<ArrayList<Integer>> cost, ArrayList<String> wordArray, String startWord, String endWord)
	{
		ArrayList<Integer> distance = new ArrayList<Integer>();		
		ArrayList<Integer> predecessor = new ArrayList<Integer>();
		ArrayList<Integer> visited = new ArrayList<Integer>();		
		int count=0,mindistance,nextnode=0,startnode;
		
		startnode = wordArray.indexOf(startWord);
		
		for(int i=0;i<wordArray.size();i++)
		{
			distance.add(i, cost.get(startnode).get(i));
			predecessor.add(i, startnode);
			visited.add(i, 0);
		}
		distance.set(startnode, 0);
		visited.set(startnode, 1);
		count=1;
		
		while(count<(wordArray.size()-1))
		{
			mindistance = 9999; // set to infinity
			
			for(int i=0;i<wordArray.size();i++)
				if((distance.get(i) < mindistance) && (visited.get(i)==0))
				{
					mindistance = distance.get(i);
					nextnode=i;
				}
			
			visited.set(nextnode, 1);
			
			for(int i=0;i<wordArray.size();i++)
			{
				if(visited.get(i)==0)
				{
					if((mindistance+cost.get(nextnode).get(i))<distance.get(i))
					{
						distance.set(i, mindistance + cost.get(nextnode).get(i));
						predecessor.set(i, nextnode);						
					}
				}				
			}
			count++;
		}
		/*
		for(int i=0;i<wordArray.size();i++)
		{
			if(i!=startnode)
			{
				System.out.println("\n\nDistance of "+i+" = "+distance.get(i));
				System.out.print("Path = "+i);
				int j=i;
				do
				{
					j=predecessor.get(i);
					System.out.print("<-"+j);
					i++;
				}while(j!=startnode);
			}
		}
		*/
		//for(int i=0;i<wordArray.size();i++)
		//{
			//if(i!=startnode)
			//{
				int i = wordArray.indexOf(endWord);
				System.out.println("\nMoves from "+startWord+" to "+endWord+" = "+distance.get(i));
				System.out.print("Path = "+wordArray.get(i));
				int j=i;
				do
				{
					j=predecessor.get(i);
					System.out.print("<-"+wordArray.get(j));
					i=j;
				}while(j!=startnode);
				System.out.println("\n");
			//}
		//}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
		String file = "/home/blackdragon/code-foo-2013/Back-end/3/three-letter-words-temp.txt";
		
		ArrayList<String> wordArray = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		AdjacencyBuilder prog = new AdjacencyBuilder();
		
		wordArray = prog.buildWordArray(file);
		
		
		temp.add(0, 2);
		cost.add(0, temp);
		
		
		
		Dijkstra path = new Dijkstra();
		path.shortestPath(cost, wordArray, 0);
		*/
	}

}
