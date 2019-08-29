import java.util.Scanner;

public class mainClass
{
	public static void main(String args[])
	{
		towerCubes Cube = new towerCubes();
		Scanner input = new Scanner(System.in);
		String winAuton;
		int autonPoints;
		switch(input.next(winAuton))
		{
			case "Yes":
				autonPoints = 6;
				break;
			case "No":
				autonPoints = 0;
				break;
			default:
				autonPoints = 3;
				break;
		}
		print("Green Scored");
		Cube.Green.scored = input.nextInt();
		print("Purple Scored");
		Cube.Purple.scored = input.nextInt();
		print("Orange Scored");
		Cube.Orange.scored = input.nextInt();

		print("Stacked Green");
		Cube.Green.currentVal = multiplier(Cube.Green.scored) * input.nextInt();
		print("Stacked Purple");
		Cube.Purple.currentVal = multiplier(Cube.Purple.scored) * input.nextInt();
		print("Stacked Orange");
		Cube.Orange.currentVal = multiplier(Cube.Orange.scored) * input.nextInt();
		
		print(String.valueOf(Cube.Green.currentVal));
		print(String.valueOf(Cube.Purple.currentVal));
		print(String.valueOf(Cube.Orange.currentVal));
		print("Your score is: " + String.valueOf(Cube.Green.currentVal + Cube.Orange.currentVal + Cube.Purple.currentVal));
	}
	private static void print(String out)
	{
		System.out.println(out);
	}
	private static int multiplier(int input)
	{
		if(input == 0)
		{
			return 1;
		}
		else
		{
			return input + 1;
		}
	}
}
