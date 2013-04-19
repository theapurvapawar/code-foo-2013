import java.io.IOException;
import java.util.ArrayList;


public class MainMoves {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file = "three-letter-words.txt";
		
		ArrayList<String> wordArray = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>();
		Dijkstra path = new Dijkstra();
		
		AdjacencyBuilder prog = new AdjacencyBuilder();
		
		wordArray = prog.buildWordArray(file);
		cost = prog.buildCostMatrix(wordArray);
		
		/*for(int i=0;i<wordArray.size();i++)
		{
			for(int j=0;j<wordArray.size();j++)
		
			{
				System.out.print(cost.get(i).get(j)+"\t");
			}
			System.out.println("\n");
		}*/
		
		
		String str1 = args[0];
		String str2 = args[1];
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		if(wordArray.indexOf(str1)==-1 || wordArray.indexOf(str2)==-1)
		{
			System.out.println("Program will exit. One of the words (or both) are not in 'three-letter-words.txt'!");
			return ;
		}
		
		path.shortestPath(cost, wordArray, str1, str2);
		

	}

}
