import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class AdjacencyBuilder {
	
	ArrayList<String> wordArray = new ArrayList<String>();
	ArrayList<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>();
	
	public ArrayList<String> buildWordArray(String fileName) throws IOException
	{		
					
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		int i=0;
		
		while ((line = br.readLine()) != null) {		   
			wordArray.add(i++, line);			
		}
		br.close();
		return wordArray;	
	}
	
	public ArrayList<ArrayList<Integer>> buildCostMatrix(ArrayList<String> wordArray)
	{
		int j=0;
		
		for(int i=0;i<wordArray.size();i++)
		{
			
			ArrayList<Integer> costIn = new ArrayList<Integer>();	
			
			for(j=0;j<wordArray.size();j++)
				costIn.add(j, 9999); // set to infinity ~9
			
			for(j=0;j<wordArray.size();j++)
			{
				
					if (checkmove(i,j)==true)
						costIn.set(j, 1);// move is 1 then set 1
				
			}
			cost.add(i, costIn);//add row entry to cost
			
		}
		
		//costIn.set(1, 1);
		//cost.set(1, costIn);
		
		
		return cost;
	}
	
	private boolean checkmove(int i, int j)
	{
		String str1 = wordArray.get(i);
		String str2 = wordArray.get(j);
		
		if (
				(str1.charAt(0)==str2.charAt(0) && str1.charAt(1)==str2.charAt(1) && str1.charAt(2)!=str2.charAt(2)) ||
				
				(str1.charAt(0)==str2.charAt(0) && str1.charAt(1)!=str2.charAt(1) && str1.charAt(2)==str2.charAt(2)) ||
				
				(str1.charAt(0)!=str2.charAt(0) && str1.charAt(1)==str2.charAt(1) && str1.charAt(2)==str2.charAt(2))
				
			)
			return true;
		else
			return false;	
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file = "/home/blackdragon/code-foo-2013/Back-end/3/three-letter-words-temp.txt";
		
		ArrayList<String> wordArray = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>();
		
		AdjacencyBuilder prog = new AdjacencyBuilder();
		
		wordArray = prog.buildWordArray(file);
		cost = prog.buildCostMatrix(wordArray);
		
		for(int i=0;i<wordArray.size();i++)
			System.out.println(i+":"+wordArray.get(i));
		
		for(int i=0;i<wordArray.size();i++)
		{
			for(int j=0;j<wordArray.size();j++)
		
			{
				System.out.print(cost.get(i).get(j)+"\t");
			}
			System.out.println("\n");
		}
		
				

	}

}
