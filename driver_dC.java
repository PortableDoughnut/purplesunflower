package docComments;

//import array list, do we doc comment this? Also what is the shortcut to get that automater import thing? **Must import array scannner or this wont work!!
import java.util.ArrayList;
import java.util.Scanner;

//Add doc comments here for the things (:
public class Driver_dC {
	
//Use doc comments to show what is being stored in the array used in this camera example
	static ArrayList<Cameras>list = new ArrayList<>();
	
	public static void main(String[]args) {
		//Insert the Camera options here for the user to choose from
		list.add(new Cameras("Canon", "DSLR", "Rebel"));
		list.add(new Cameras("Canon", "DSLR", "Mark II"));
		list.add(new Cameras("Nikon", "DSLR", "D3500"));
		list.add(new Cameras("Nicon", "SLR", "FM2"));
		list.add(new Cameras("Sony", "Mirrorless Digital", "Alpha"));
		list.add(new Cameras("Sony", "DSLR", "Cybershot"));
		//Create a loop which will display the menu options... While loop?
		//Doc comment the shit out of this bad boy!
		while(true) { //use valueinput when found within loop
			displayMenu();
		}
	}
	//Display menu options for cameras here to allow user the choice
	private static void displayMenu() {
		Scanner scan = new Scanner(System.in);
		//Allow user to input a number value for choice
		int valueinput;
		System.out.print("1. Show all Cameras");
		System.out.print("2. Add a Camera");
		System.out.print("3. Find a Camera");
		System.out.print("4. Delete a Cameras");
		System.out.print("5. Number of cameras");
		System.out.print("6. Exit menu");
		
		//Engage the user to input a value from 1-6
		System.out.print("Enter the Value of your selection :");
		
		//Allow the user to input a value from 1-6 and read it
		valueinput = scan.nextInt();
		scan.nextLine();
		
		//Display the input value
		System.out.print(0);
		showResults(valueinput,scan);
		
	}
	
	private static void showResults(int valueinput, Scanner scan) {
		
		
	}
	//Show the showResults after user has made their decision
	private static void showResults(int valueinput,Scanner scan) {
		int id; 
		//how to check that the id actually works??
		
		//Case system can be used to provide options to user
		switch(valueinput) {
		
		
		//Case 1  gives the cameras avaliable e.g. Canon, Nikon and Sony
		case 1:
			for(Cameras i:list) {
				System.out.print(i);
			}
			System.out.print(0);// CHECK THIS PRINT()
			break;
		//Case 2 gives the option of adding a new camera to the list
		case 2:
			System.out.print("Name: ");
	       	String name = scan.nextLine();
	       	System.out.print("Type: ");
	       	String type = scan.nextLine();
	       	System.out.print("Model: ");
	       	String model = scan.nextLine(); 
	        
	       	list.add(new Cameras(name, type, model));
	       	System.out.println();
	       	break;
	       	
	       	//Case 3 gives the user the option to find the camera while using the id number
	       	
	       	//Case 4 gives the user the option to delete the camera while using the id number
	       	
	       	//Case 5 gives the user the ability to check the number of cameras currently registered in the system
	       	
	       	//Case 6 gives the user the option to exit from the  system
	       	System.out.print("Exiting the system now... Goodbye mofos!");
	       	System.exit(0);
	       	
	       	//Make a contingency for when the user inputs a non existent value into the system

			
		}
		
	}
	
	
	
}
