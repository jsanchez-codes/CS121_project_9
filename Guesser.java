// Guesser.java

import java.util.*;

public class Guesser {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Guesser();
	} // end main
	
	public Guesser(){
		boolean keepGoing = true;
		String response = " ";
		while(keepGoing){
			response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				humanGuesser();
			} else if (response.equals("2")){
				computerGuesser();

			} else {
				System.out.println("Invalid input. Please enter a 0, 1, or 2");
			} // end if
		}  // end while
	} // end constructor
	
	public String menu(){
		String response = " ";
		System.out.println();
		System.out.println("0) Quit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");

		System.out.print("0, 1, or 2: ");
		response = input.nextLine();
		return response;
	} // end menu

	public void humanGuesser(){
		Scanner input = new Scanner(System.in);
		int correct = math.nextInt(101);
		int guess = 0;
		int turns = 0;
		System.out.println("Human Guesser");
		System.out.println(correct);
		boolean keepGoing = true;
		while(keepGoing){
			turns++;
			System.out.println("Please enter a number 0-100: ");
			guess = input.nextInt();
			if (guess < correct){
				System.out.println("Too low.");
			} else if (guess > correct){
				System.out.println("Too high.");
			} else {
				System.out.println("Correct!");
				keepGoing = false;
			} // end if

			if (turns < 7){
				System.out.println("You win! You guessed the number in less than 7 turns.");
			} else if (turns > 7){
				System.out.println("You lose. Play again to try and guess the number in 7 or less turns.");
			} else {
				System.out.println("It's a tie. Play again to try to guess the number in less than 7 turns.");
			} // end if
		} // end while
	} // end humanGuesser
	
	public void computerGuesser(){
		System.out.println("Computer Guesser");
	} // end computer
	
} // end Guesser

