import java.util.Scanner;

public class mainClass
{
	public static void main(String args[])
	{


		towerCubes Cube = new towerCubes();
		Scanner f = new Scanner(System.in);
		runtime(f, Cube);
		runtime(f, Cube);
		f.close();
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
	public static void Scored(Scanner name, towerCubes Cube)
	{
		print("Green Scored");
		Cube.Green.scored = name.nextInt();
		print("Purple Scored");
		Cube.Purple.scored = name.nextInt();
		print("Orange Scored");
		Cube.Orange.scored = name.nextInt();
	}
	public static void Stacked(Scanner name, towerCubes Cube)
	{
		print("Stacked Green");
		Cube.Green.currentVal = multiplier(Cube.Green.scored) * name.nextInt();
		print("Stacked Purple");
		Cube.Purple.currentVal = multiplier(Cube.Purple.scored) * name.nextInt();
		print("Stacked Orange");
		Cube.Orange.currentVal = multiplier(Cube.Orange.scored) * name.nextInt();
	}

	public static void Scoring(towerCubes Cube, int autonPoints)
	{
		print("The score is: " + String.valueOf(autonPoints +
				Cube.Green.currentVal +
				Cube.Orange.currentVal +
				Cube.Purple.currentVal));
	}

	public static void runtime(Scanner name, towerCubes Cube)
	{
		print("Auton Win");
		int autonPoints;
		switch(name.next())
		{
			case "Yes":
				autonPoints = 6;
				break;
			case "Tie":
				autonPoints = 3;
				break;
			default:
				autonPoints = 0;
				break;
		}
		Scored(name, Cube);
		Stacked(name, Cube);
		Scoring(name, Cube, autonPoints);


	}
}
