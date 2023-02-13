
public class BowlingGame_1 
{

	public static void main(String args[]){  
 
		int frames[][]={
				{1, 4},
				{4, 5},
				{6, 4},
				{5, 5},
				{10, 0},
				{0, 1},
				{7, 3},
				{6, 4},
				{10, 0},
				{2, 8, 6},
		};  


		int score = 0;
		for (int i = 0; i < frames.length; i++) 
		{
			if (i == frames.length - 1)
			{
				for (int j = 0; j < frames[i].length; j++) 
				{
					score += frames[i][j] ;
				}
			}
			else
			{
				score += frames[i][0] + frames[i][1];
				if (frames[i][0] == 10) 
				{
					score += frames[i + 1][0] + frames[i + 1][1];
				} else if (frames[i][0] + frames[i][1] == 10) 
				{
					score += frames[i + 1][0];
				}
			}
		}

		System.out.println("The score for the Bowling game is :"+ score);
		
	}
}

	