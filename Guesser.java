// Guesser.java

import java.util;

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
		System.out.print("0, 1, or 2");
		response = input.nextLine();
		return response();
	} // end menu

	public void humanGuesser(){
		System.out.println("Human Guesser");
	} // end humanGuesser
	
	public void computerGuesser(){
		System.out.println("Computer Guesser");
	} // end computer
	
} // end Guesser

