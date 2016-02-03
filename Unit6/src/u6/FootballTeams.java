package u6;

import java.util.Scanner;

public class FootballTeams {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your favorite football team?");
		
		String team = input.nextLine();
		
		if (team.equalsIgnoreCase("Giants"))
			System.out.println("Me too.");
		else if (team.equalsIgnoreCase("Cowboys"))
			System.out.println("Never.");
		else
			System.out.println("Ok.");
	}
}
