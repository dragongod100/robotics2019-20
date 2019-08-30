import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class mainClass
{
	
	private static int[] scores = new int[3];
	private static int[] totals = new int[3];
	public static void main(String args[])
	{
		//TextFieldEx window = new TextFieldEx();
		getScored.getScoredCube();
		getScored.getScoredCubes("Green scored: ", scores[0]);
		print(String.valueOf(scores[0]));
		/*
		towerCubes Cube = new towerCubes();
		Scanner f = new Scanner(System.in);
		Scored(f, Cube);
		
		Stacked(f, Cube);
		Scoring(auton(f));
		
		Stacked(f, Cube);
		Scoring(auton(f));
		
		f.close();*/
	}
	
	public static void Scored(Scanner name, towerCubes Cube)
	{
		print("Green Scored");
		scores[0] = Cube.Green.scored = name.nextInt();
		print("Purple Scored");
		scores[1] = Cube.Purple.scored = name.nextInt();
		print("Orange Scored");
		scores[2] = Cube.Orange.scored = name.nextInt();
	}
	
	public static void Stacked(Scanner name, towerCubes Cube)
	{
		print("Stacked Green");
		Cube.Green.stacked = name.nextInt();
		totals[0] = Cube.Green.total = (scores[0] + 1) * Cube.Green.stacked;
		print("Stacked Purple");
		Cube.Purple.stacked = name.nextInt();
		totals[1] = Cube.Purple.total = (scores[1] + 1) * Cube.Purple.stacked;
		print("Stacked Orange");
		Cube.Orange.stacked = name.nextInt();
		totals[2] = Cube.Orange.total = (scores[2] + 1) * Cube.Orange.stacked;
	}
	
	private static void print(String out)
	{
		System.out.println(out);
	}

	public static int auton(Scanner name)
	{
		print("Auton Win");
		switch(name.next())
		{
			case "Yes":
				return 6;
			case "Tie":
				return 3;
			default:
				return 0;
		}
	}
	
	public static void Scoring(int autonPoints)
	{
		print("The score is: " + String.valueOf(autonPoints + totals[0] + totals[1] + totals[2]));
	}
}
