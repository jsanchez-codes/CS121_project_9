// Guesser.java

import java.util.*;

public class Guesser {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Guesser();
	} // end main
	
	public Guesser(){
		boolean keepGoing = true;
		while(keepGoing){

			String guess = menu();

				if (guess.equals("1")){
					System.out.println("Please enter a number: ");
					String number = input.nextLine();
					System.out.println(human(number));

				} else if (guess.equals("2")){
					System.out.println("Please enter a number: ");
					String digit = input.nextLine();
					System.out.println(computer(digit));

				} else if (response.equals("0")){
					System.out.println("Goodbye!");
					keepGoing = false;

				} else {
					System.out.println("Invalid input. Please enter a number 0-2");
				} // end if
		}  // end while
	} // end constructor
	
	public String menu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		string guess = input.nextLine();
		return guess;
	} // end menu

	public String human(string number){
	
	} // end human
	
	public String computer(string digit){

	} // end computer
	
} // end Guesser

