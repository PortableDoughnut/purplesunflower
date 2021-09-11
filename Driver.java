package docComments;

// Imports
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	
	static ArrayList<Cameras> camList = new ArrayList<>();
	static Random ran = new Random();
	static Scanner scan = new Scanner(System.in);

	
	/**
	 * Adds the starting camera objects and displays the menu
	 */
	public static void main(String[] args) {
		
		listAdd("Cannon", "DSLR", "Rebel");
		listAdd("Cannon", "DSLR", "Mark II");
		listAdd("Nikon", "DSLR", "D3500");
		listAdd("Nikon", "SLR", "FM2");
		
		displayMenu();

	}
	
	
	/**
	 * 
	 * Adds new cameras with the needed paramaters
	 * 
	 * @param name
	 * name of the camera
	 * @param type
	 * type of the camera
	 * @param model
	 * model of the camera
	 */
	public static void listAdd(String name, String type, String model) {
		camList.add(new Cameras(name, type, model));
	}
	
	
	/**
	 * Displays the menu of the program. Gets user input and then calls showResults() with what was selected
	 */
	private static void displayMenu() {
		//Allow user to input a number value for choice
		int valueInput;
		System.out.println("1. Show all Cameras");
		System.out.println("2. Add a Camera");
		System.out.println("3. Find a Camera");
		System.out.println("4. Delete a Cameras");
		System.out.println("5. Number of cameras");
		System.out.println("6. Exit menu");
		
		//Engage the user to input a value from 1-6
		System.out.print("Enter the Value of your selection : \n");
		
		//Allow the user to input a value from 1-6 and read it
		valueInput = scan.nextInt();
		scan.nextLine();
		
		//Display the input value
		System.out.print(valueInput + ": \n");
		showResults(valueInput);
		
	}
	
	
	/**
	 * 
	 * preforms the various tasks of the program based on whtat was selected, then calls displayMenu() again
	 * 
	 * @param valueInput
	 * The option that was chosen form the menu
	 */
	public static void showResults(int valueInput) {
		
		switch (valueInput) {
		//Case 1  gives the cameras avaliable e.g. Canon, Nikon and Sony
		case 1:
			for(Cameras i:camList) {
				System.out.println(i);
			}
			System.out.println();
			displayMenu();
			break;
			
			//Case 2 gives the option of adding a new camera to the list
		case 2:
			System.out.print("Name: ");
	       	String name = scan.nextLine();
	       	System.out.print("Type: ");
	       	String type = scan.nextLine();
	       	System.out.print("Model: ");
	       	String model = scan.nextLine(); 
	        
	       	listAdd(name, type, model);
	       	System.out.println();
	       	
	       	displayMenu();
	       	break;
	       
	      //Case 3 gives the user the option to find the camera while using the id number
		case 3:
			
			
			displayMenu();
			break;
			
			//Case 4 gives the user the option to delete the camera while using the id number
		case 4:
			
			
			displayMenu();
			break;
	       	
			//Case 5 gives the user the ability to check the number of cameras currently registered in the system
		case 5:
				System.out.println(camList.size() + " cameras");
			
			displayMenu();
			break;
			
			//Case 6 gives the user the option to exit from the  system
		case 6:
			System.out.println("Thank you! See you soon ;)");
			break;

			// Contingency for when the user inputs a non existent value into the system
		default:
			System.out.print("Try again please!\n");
			displayMenu();
			break;
		}
	}

}
