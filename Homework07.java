/*****************************************************************
 * Homework07.java
 * Sabrina Kramer
 * CS 250
 * 
 * This VERY long program allows player to play a randomized dice game
 * There are three dice for the player and Computer that
 * are six sided. The player wins, loses, or ties 
 * based off the outcome of the rolls which 
 * are either Triple, Pairs, or Junk.
 * 
 * 
 *****************************************************************/



import java.util.Scanner;

public class Homework07 
{
	public static void main(String [] args)
    {
		Scanner stdId = new Scanner(System.in);
		String userInput = "y";
		int totalPlays = 0;
		int wins = 0;
		int losses = 0;
		int ties = 0;		
		
		System.out.println("             ~Welcome to Opponent Dice~");
		System.out.println("-------------------------------------------------------");
		System.out.println("You will be playing dice against the oponent.");
		System.out.println();		
		System.out.println("The outcome of your roll will be determined: ");
		System.out.println("High beats low, and same ties");
		System.out.println("Triple beats Pairs and Junk.");
		System.out.println("Pairs beat Junk.");
		System.out.println("In the case of two identical Pairs - high card decides.");
		System.out.println("In the case of two Junks - it's a tie.");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		do
		{
		int p1 = (int)(Math.random() * 6) + 1; //creates a six sided die; number 1-6 is randomized
		int p2 = (int)(Math.random() * 6) + 1;
		int p3 = (int)(Math.random() * 6) + 1;
				
		int c1 = (int)(Math.random() * 6) + 1;
		int c2 = (int)(Math.random() * 6) + 1;
		int c3 = (int)(Math.random() * 6) + 1;
		
		totalPlays += 1;
		
		System.out.println("Player Dice:   " + p1 + " " + p2 + " " + p3);
		System.out.println("Computer Dice: " + c1 + " " + c2 + " " + c3);
		
		if((p1 == p2 && p2 == p3) && (c1 == c2 && c2 == c3)) 	//This is the P and C have triple; checks for high or same	
		{
			if (p1 > c1)
			{	
				++wins;
				System.out.println("Congrats, you win!");
			}
			else if (p1 < c1)
			{
				++losses;
				System.out.println("Sorry, you lost.");
			}
			else
			{
				++ties;
				System.out.println("You tied.");

			}
		}
		else if((p1 == p2 && p2 == p3) && (c1 != c2 && c2 != c3)) //P has triple, but C doesn't have triple
		{
			++wins;
			System.out.println("Congrats, you win!");
		}
		else if((p1 != p2 && p2 != p3) && //junk for P and pair for C
				(c1 == c2 || 			
				c1 == c3  ||
				c2 == c3))
		{
			++losses;
			System.out.println("Sorry, you lost.");
				
		}
		else if ((p1 == p2  ||		//All of the pairs between P and C
				  p1 == p3  ||
				  p2 == p3) &&
				 (c1 == c2  ||
				 c1 == c3   ||
				 c2 == c3))
		{
			if(p1 == p2 && c1 == c2) //Pair
			{
				if (p1 > c1)
				{
					++wins;
					System.out.println("Congrats, you win!");
				}
				else if(p1 < c1)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if (p1 == p2 && c2 == c3) //Pair
			{
				if(p1 > c2)
				{
					++wins;
					System.out.println("Congrats, you win!");
				}
				else if(p1 < c2)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if(p2 == p3 && c1 == c2) //Pair
			{
				if(p2 > c1)
				{
					++wins;
					System.out.println("Congrats, you win!");
				}
				else if(p2 < c1)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if(p2 == p3 && c2 == c3) //Pair
			{
				if(p2 > c2)
				{
					++wins;
					System.out.println("Congrats, you win!");
				}
				else if(p2 < c2)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else 
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if(p1 == p2 && c1 ==c3) //Pair
			{
				if(p1 > c1)
				{
					++wins;
					System.out.println("Congrats, you win!");

					
				}
				else if(p1 < c1)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if (p2 == p3 && c1 == c3) //Pair
			{
				if (p2 > c1)
				{
					++wins;
					System.out.println("Congrats, you win!");

				}
				else if(p2 < c1)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				
				}
				else
				{
					++ties;
					System.out.println("You tied.");

				}
			}
				
			else if (p1 == p3 && c1 == c2) //Pair
			{	if (p1 > c1)
				{
					++wins;
					System.out.println("Congrats, you win!");

				}
				else if (p1 < c1)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else 
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if (p1 == p3 && c1 == c3) //Pair
			{	
				if (p1 > c1) 
				{
					++wins;
					System.out.println("Congrats, you win!");

					
				}
			
				else if (p1 < c1) 
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else 
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			else if (p1 == p3 && c2 == c3) //Pair
			{
				if (p1 > c2) 
				{
					++wins;
					System.out.println("Congrats, you win!");

				}
				else if (p1 < c2)
				{
					++losses;
					System.out.println("Sorry, you lost.");

				}
				else 
				{
					++ties;
					System.out.println("You tied.");

				}
			}
			
		}
		else if ((p1 == p2 ||		//Pair for P and Triple for C
				 p1 == p3  ||
				 p2 == p3) &&
				(c1 == c2  && c2 == c3))
		{
			++losses;
			System.out.println("Sorry, you lost.");
		}
		else if((p1 == p2  ||
				 p1 == p3  ||
				 p2 == p3) &&
				(c1 != c2  && c2 != c3)) //Pair for P and junk for C
		{
			++wins;
			System.out.println("Congrats, you win!");
		}
		
		else if((p1 != p2 && p2 != p3) && //junk for P and junk for C
				(c1 != c2 && c2 != c3))
		{
			++ties;
			System.out.println("You tied.");
			
		}
		
		else if((p1 != p2 && p2 != p3) && 
				(c1 == c2 && c2 == c3)) //junk for P and triple for C
		{
			++losses;
			System.out.println("Sorry, you lost.");

		}
		
	
		
		System.out.println("Would you like to play again (y, n): ");
		userInput = stdId.next();
		} while(userInput.equals("y"));
		
		System.out.println("Total ties: " + ties);
		System.out.println("Total wins: " + wins);
		System.out.println("Total losses: " + losses);
		System.out.println("Total Plays: " + totalPlays);

		stdId.close();
    }
}

