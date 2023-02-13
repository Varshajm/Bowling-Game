import java.util.Iterator;
import java.util.Scanner;

public class BlowingGame
{

	static int strike = 10;
	static int spare = 10;
	static int frame = 10;
	static int score;
	static int ball1, ball2, ball3;

	public static void main(String[] args) 
	{

    Scanner in = new Scanner(System.in);
		
		for (int j = 1; j <= frame; j++) 
		{
			System.out.println(" this is ::" + j);
			System.out.println("Enter the score of ball1 ::");
			int ball1 = in.nextInt();

			System.out.println("Enter the score of ball2 ::");
			int ball2 = in.nextInt();


			
		}}
		
		public static void rules()
		{
			if (ball1 == 0 || ball2 == 0)  //spare
			{
				int l = score + spare + ball3;
				System.out.println(score);
				System.out.println(spare);
				System.out.println(ball3);
				System.out.println("Total score for spare is ::" + l);
			
			} 
			else if (ball1 != 0 || ball2 != 0)  // normal
			{
				score = score + ball1 + ball2;
				System.out.println("Total score is ::" + score);
			}
			else if (ball1 == 0 && ball2 == 0) // strike
			{
				score = score + strike+ball1+ball2;
				score= score + 20; //strike followed by spare
			}
		}
	}





