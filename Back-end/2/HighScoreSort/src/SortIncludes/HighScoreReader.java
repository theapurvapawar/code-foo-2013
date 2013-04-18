package SortIncludes;

import java.util.ArrayList;



 
public class HighScoreReader {
 
	public static void main(String[] args) {
		
		String fileName = args[0];
		
		ScoreParser parser = new ScoreParser();
		
		ArrayList<player> playerList = parser.scoreList(fileName);
		
		 QuickSortScore algo = new QuickSortScore();
		 
		 algo.sort(playerList);
		
		
		for(int i=playerList.size()-1;i>-1;i--)
        {
        		player Player = playerList.get(i);
        		System.out.println("\nPlayer : " + Player.name + "\n\t Score : " + Player.score);
        }
	

	}
	
}