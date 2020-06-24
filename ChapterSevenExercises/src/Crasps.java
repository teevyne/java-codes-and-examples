import java.security.SecureRandom;
import java.util.Scanner;

public class Crasps
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOST };

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static boolean play()
	{
		boolean outcome = false;
		Scanner input = new Scanner (System.in);

		int bankBalance = 1000;
		int myPoint = 0;
		Status gameStatus;
		
		while (bankBalance > 0){

			System.out.print("\n\nEnter your wager: ");
			int wager = input.nextInt();

			while (wager > bankBalance)
			{
				System.out.print("Enter your wager: ");
				wager = input.nextInt();
			}

			int sumOfDice = rollDice();

			switch (sumOfDice)
			{
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					break;
				default:
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice;
					System.out.printf("Point is %d%n", myPoint);
					break;
			}

			while (gameStatus == Status.CONTINUE)
			{
				sumOfDice = rollDice();

				if (sumOfDice == myPoint) {
					gameStatus = Status.WON;
					outcome = true;
				}
				
				else
					if (sumOfDice == SEVEN) {
						gameStatus = Status.LOST;
						outcome = false;
					}
				//return outcome;
			}

			if (gameStatus == Status.WON)
			{
				System.out.println("Player wins");
				bankBalance += wager;
				System.out.printf("Your new balance is %d", bankBalance);
			}
			
			else
			{
				System.out.println("Player loses");
				bankBalance -= wager;
				System.out.printf("Your new balance is %d", bankBalance);
				chatter(bankBalance);
			}
		}
		System.out.println("\nSorry. You busted!");
		return outcome;
	}

	public static int rollDice()
	{
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}

	public static String chatter(int num)
	{
		String reply = "";
		//int num = 0;
		int response = 2 + 2 * randomNumbers.nextInt(3);
		switch (response)
		{
			case 2:
				System.out.println("\nOh, you're going for broke, huh?");
				break;
			case 4:
				System.out.println("\nAw c'mon, take a chance!");
				break;
			default:
				System.out.println("\nYou're up big. Now's the time to cash in your chips!");
				break;
		}
		return reply;
	}
}