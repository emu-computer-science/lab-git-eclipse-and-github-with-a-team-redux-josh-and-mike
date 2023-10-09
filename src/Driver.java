import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DisplayMenu();
		System.out.println();
		System.out.print("Choice: ");
		int choice = scnr.nextInt();
		choose(choice);
		scnr.close();
	}
	
	public static void choose(int choice) {
		switch(choice) {
		case 1:
			Glad.glad();
			break;
		case 2:
			Sad.sad();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
	public static void DisplayMenu() {
		System.out.println("Choose which method to execute");
		System.out.println("1. Glad");
		System.out.println("2. Sad");
	}
}
