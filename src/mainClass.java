import java.util.Scanner;

public class mainClass
{
	public static void main(String args[])
	{
		towerCubes Cube = new towerCubes();
		Scanner input = new Scanner(System.in);
		
		Cube.Green = input.nextInt();
		Cube.Orange = input.nextInt();
		Cube.Purple = input.nextInt();
		Cube.towerHigh[0] = 0;
	}
}
