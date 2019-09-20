/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :)   

public class ASCIIArt {
	public static void tip() {
		System.out.println("\t      ^ ");
		System.out.println("\t     / \\ ");
		System.out.println("\t    /   \\ ");
		System.out.println("\t   /     \\ ");
		System.out.println("\t  /       \\ ");
	}

	public static void bottomLength() {
		System.out.println("\t  |       | ");
	}

	public static void topLength() {
		System.out.println("\t   |     | ");
	}

	public static void fullLength() {
		topLength();
		topLength();
		topLength();
		topLength();
		topLength();
		topLength();
		System.out.println("\t  /       \\ ");
		bottomLength();
		bottomLength();
		bottomLength();
	}

	public static void engine() {

		System.out.println("      /\\  |   N   |  /\\");
		System.out.println("     /  \\ |   E   | /  \\");
		System.out.println("    /    \\|   W   |/    \\");
		System.out.println("    |    ||   P   ||    |");
		System.out.println("    |    ||   O   ||    |");
		System.out.println("    |    ||   R   ||    |");
		System.out.println("    |    ||   T   ||    |");
		System.out.println("    |    ||       ||    |");
		System.out.println("    \\____/\\___|___/\\____/");
	}

	public static void fire() {
		System.out.println("     \\vv/  \\vvvvv/  \\vv/");
		System.out.println("      \\/    \\vvv/    \\/");
		System.out.println("             \\v/");
		System.out.println("              v");
	}

	public static void main(String[] args) {
		tip();
		fullLength();
		engine();
		fire();
		System.out.println(" Houston, we have liftoff!");
		System.out.println(" Per aspera, ad astra.");

	}
}